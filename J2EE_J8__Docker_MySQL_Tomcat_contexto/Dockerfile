FROM tomcat:8-jdk8-corretto
LABEL maintainer="blogruben"

ADD app.war /usr/local/tomcat/myapps/
RUN mkdir -p /usr/local/tomcat/conf/Catalina/localhost;
RUN cd /usr/local/tomcat/conf/Catalina/localhost; echo '<?xml version="1.0"?><Context docBase="/usr/local/tomcat/myapps/app.war"></Context>' > demo.xml

EXPOSE 8080
CMD ["catalina.sh", "run"]
