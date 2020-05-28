# under\_utilized\_instance\_rule

This rule checks if average CPU utilization is below threshold level 

Only \[a1, t3, t3a, t2, m6g, m5d, m5, m5a, m5ad, m5n, m5dn, m4, m1, t1, m3, c5, c5d, c5n, c4, c3, c1\] instance families are analyzed.

## Permissions

* [ec2:DescribeRegions](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeRegions.html)
* [ec2:DescribeInstances](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeInstances.html)
* [cloudwatch:GetMetricStatistics](https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_GetMetricStatistics.html)

## Config Parameters used

* included\_tag
* excluded\_tag
* under\_utilized\_cpu\_percentage\_instance
* cloudwatch\_config\_duration



