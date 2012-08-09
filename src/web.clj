(ns web
  (:use
    compojure.core
    ring.adapter.jetty))

(defroutes app-routes
  (GET "/" [] "hello, world"))

(run-jetty app-routes
  {:port (Integer/parseInt (or (System/getenv "PORT") "8080"))})
