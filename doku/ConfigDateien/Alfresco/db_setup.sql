create database alf_jetty default character set utf8 collate utf8_bin;
grant all on alf_jetty.* to 'alfresco'@'localhost' identified by 'alfresco' with grant option;
grant all on alf_jetty.* to 'alfresco'@'localhost.localdomain' identified by 'alfresco' with grant option;
