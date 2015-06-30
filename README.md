To deploy to Fuse as ogsi bundle

mvn install:install-file -Dfile=sqljdbc_4.0/enu/sqljdbc4.jar -DgroupId=com.microsoft.sqlserver -DartifactId=sqljdbc4 -Dversion=4.0 -Dpackaging=jar


osgi:install -s wrap:mvn:com.microsoft.sqlserver/sqljdbc4/4.0

osgi:install mvn:commons-dbcp/commons-dbcp/1.4

osgi:install -s mvn:tutorial/simple-route/1.0.0-SNAPSHOT
