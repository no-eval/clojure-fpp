(ns clojure-fpp.core
  (:gen-class))

(defn -main
  "This function will print the prerequisites to getting started with Clojure"
  []
  (println "Here are the prerequisites to get started with Clojure: \n",
           "1. IntelliJ IDEA \n",
           "2. Cursive plugin for IntelliJ IDEA \n",
           "3. clj-kondo binary [https://github.com/borkdude/clj-kondo/releases] \n",
           "4. File Watchers plugin for IntelliJ IDEA [https://github.com/borkdude/clj-kondo/blob/master/doc/editor-integration.md]"))

(-main)

(defn helpfulResources
  "This function will print all the resources that helped me get started"
  []
  (println "Here are the list of helpful resources: \n",
           "1. Intro [https://medium.com/hackernoon/clojure-functional-programming-38cc6a9298f5] \n",
           "2. Tooling and setup [https://www.youtube.com/watch?v=kjJVfoqFj_k] \n"
           "3. Debugging with REPL [https://www.youtube.com/watch?v=tpcl5pjkRTQ] \n"))

(helpfulResources)

; To run the project in REPL - Right click on project.clj and click on *Run 'REPL for Hello'*
; CMD+SHIFT+L loads the current file in the REPL