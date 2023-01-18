# Docker-Compose 結構練習

此範例有三層，詳細可查看 yaml 
1. 前端：Nginx - 使用自訂的 nginx.config 製作 Image
2. 後端：Tomcat (Springboot) - 寫一個 Controller 讀取資料庫的計數器
3. 資料庫：Mysql - 儲存計數器資料

![](https://i.imgur.com/C50yL5r.png)

流程如下：
1. 前端 html 點 Click 按鈕，送 Request 給 Nginx 反向代理到後端
2. 後端接到 Request 後向 Database 查詢資料後回傳
3. 前端顯示 Response 資料

```shell
# 啟動
docker-compose up
```
```shell
# 啟動時一併重建
docker-compose up -d --build
```
```shell
# 水平擴增後端
docker-compose up -d --scale backend=3
```
```shell
# 關閉
docker-compose down
```