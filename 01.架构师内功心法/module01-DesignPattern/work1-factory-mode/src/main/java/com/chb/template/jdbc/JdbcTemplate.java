package com.chb.template.jdbc;



import javax.sql.DataSource;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class JdbcTemplate {

    private DataSource dataSource;

    public JdbcTemplate(DataSource dataSource){
        this.dataSource = dataSource;
    }

    public List<?> executeQuery(String sql,RowMapper<?> rowMapper,Object[] values){
        try {
            //1.获取连接
            Connection conn = this.getConnection();
            //2.创建语句集
            PreparedStatement pstm = this.createPrepareStatement(conn, sql);
            //3.执行语句集
            ResultSet rs = this.excuteQuery(pstm, values);
            //4.处理结果集
            List<?> result = this.paresResultSet(rs, rowMapper);
            //5.关闭结果集
            this.closeResultSet(rs);
            //6.关闭语句集
            this.closeStatement(pstm);
            //7.关闭连接
            this.closeCnnection(conn);
            return result;
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    private void closeCnnection(Connection conn) throws SQLException {
        conn.close();
    }

    private void closeStatement(PreparedStatement pstm) throws SQLException {
        pstm.close();
    }

    private void closeResultSet(ResultSet rs) throws SQLException {
        rs.close();
    }


    private List<?> paresResultSet(ResultSet rs, RowMapper<?> rowMapper) throws Exception {
        List<Object> rsult = new ArrayList<>();
        int rowNum = 0;
        while(rs.next()){
            rsult.add(rowMapper.mapRow(rs,rowNum++));
        }
        return rsult;
    }

    private ResultSet excuteQuery(PreparedStatement pstm, Object[] values) throws SQLException {
        for (int i = 0; i < values.length; i++) {
            pstm.setObject(i,values[i]);
        }
        return pstm.executeQuery();
    }

    private PreparedStatement createPrepareStatement(Connection conn, String sql) throws SQLException {
        return conn.prepareStatement(sql);
    }

    private Connection getConnection() throws SQLException {
        return this.dataSource.getConnection();
    }
}
