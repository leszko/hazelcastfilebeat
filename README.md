# Hazelcast with logs exported with Filebeat

When you run run the application, the logs are created in the current directory in the `log.log` file.

Then, to use Filebeat to export logs to Elasticsearch (or Logstash), use the [following description](https://dzone
.com/articles/a-filebeat-tutorial-getting-started) with the [filebeat.yml](filebeat.yml) configuration.