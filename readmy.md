mysql查询 查询近30天的记录 record_date时间字段
SELECT * FROM bison_reports.amz_report_conversion_rate where DATE_SUB(CURDATE(), INTERVAL 30 DAY) <= date(record_date)