package JDBCObject;

import JDBC.linkToDatabase;

public class lpCreateDatabase {

    public lpCreateDatabase() {
        linkToDatabase lp_domon = new linkToDatabase(
                "com.mysql.jdbc.Driver" ,
                "root" ,
                "lp184126" ,
                "jdbc:mysql://localhost:3306/tempfile");
        if (this.getSqlString() != null) {
            lp_domon.setSqlIntructions(this.getSqlString());

            lp_domon.settingDtabase();

            lp_domon.palySQLIntructions();

            lp_domon.closeDatabaseFile();

            System.out.println("数据库创建完毕！");
        }else { ;
        }
    }

    public String getSqlString() {
        return sqlString;
    }

    public void setSqlString(String sqlString) {
        this.sqlString = sqlString;
    }

    String sqlString  = "CREATE TABLE laowangfruit("
            + "lp_fruit_id                   INT(10)         PRIMARY KEY     AUTO_INCREMENT, "
            + "lp_fruit_name                 VARCHAR(25)     NOT NULL, "
            + "lp_fruit_number               INT(5)          NOT NULL, "
            + "lp_fruit_price                INT(4)          NOT NULL, "
            + "lp_fruit_manufacturers        VARCHAR(20)     NOT NULL, "
            + "lp_fruit_production_date      DATE            NOT NULL, "
            + "lp_fruit_shelf_life           INT(3)          NOT NULL, "
            + "lp_fruit_lastdate             DATE            NOT NULL"
            +
            ");";

}
