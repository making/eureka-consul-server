``` yaml
scrape_configs:
  - job_name: 'demo'
    metrics_path: /actuator/prometheus
    consul_sd_configs: 
      - server: eureka-consul.cfapps.io
        scheme: https
    relabel_configs:
      - source_labels: [__meta_consul_service]
        action: replace
        target_label: cf_app_name
      - source_labels: [__meta_consul_service_id]
        action: replace
        target_label: cf_instance_guid
```