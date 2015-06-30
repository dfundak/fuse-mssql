package simple_route;

import org.apache.camel.language.XPath;

public class OrderToSqlBean {
	
    public String toSql(@XPath("person/@user") String name) {

StringBuilder sb = new StringBuilder();
sb.append("insert into t_Fuse (name) values ('test')");
System.out.println(sb.toString());
return sb.toString();
}

}
