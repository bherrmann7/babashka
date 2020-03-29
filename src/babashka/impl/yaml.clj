(ns babashka.impl.yaml
  {:no-doc true}
  (:require [sci.impl.namespaces :refer [copy-var]]
            [sci.impl.vars :as vars]
            [yaml.core :as yaml]))

(def yns (vars/->SciNamespace 'clj-yaml.core nil))

(def yaml-namespace
  {'generate-string (copy-var yaml/generate-string yns)
   'parse-string (copy-var yaml/parse-string yns)})
