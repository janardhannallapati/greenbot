# Config Params

Config parameters are represent by JSON on home page when you launch [localhost:5000](http://localhost:5000)

```text
[
    {
        "key": "excluded_tag",
        "value": "",
        "description": "Resources with this tag will not be analyzed. Format <key>=<value>"
    },
    {
        "key": "included_tag",
        "value": "",
        "description": "Only resources with this tag will be analyzed. Format <key>=<value>"
    },
    {
        "key": "too_many_ami_threshold",
        "value": "500",
        "description": "Threshold AMI count above which too_many_instance_images_rule rule will raise a concern"
    },
    {
        "key": "under_utilized_cpu_percentage_instance",
        "value": "30.0",
        "description": "Average CPU utilization threshold for under-utilized ec2 machine"
    },
    {
        "key": "under_utilized_cpu_percentage_database",
        "value": "10.0",
        "description": "Average CPU utilization threshold for under-utilized RDS instances"
    },
    {
        "key": "cloudwatch_config_duration",
        "value": "10080",
        "description": "Duration for which cloudwatch data to be analyzed(in minutes), should be multiple of 5 with min value of 10"
    },
    {
        "key": "rules_to_ignore",
        "value": "",
        "description": "Comma separated rule ids to ignore for example too_many_instance_images_rule,delete_orphan_instance_storage_rule"
    }
]
```

These config parameters are used to tweak the behavior of rules.

