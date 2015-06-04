(ns mimina.config
  (:import (com.typesafe.config Config)
           (com.typesafe.config ConfigFactory)))

(defn get-config
  ^Config [filename]
  (ConfigFactory/load filename))

(defn get-property
  [^Config config prefix field]
  (-> config (.getString (format "%s.%s" prefix field))))