(ns clojure-fpp.core
  (:gen-class))

(defn -main
  "This function will print the prerequisites to getting started with Clojure"
  []
  (println "Here are the prerequisites to get started with Clojure: \n"
           "1. IntelliJ IDEA \n"
           "2. Cursive plugin for IntelliJ IDEA \n"
           "3. clj-kondo binary [https://github.com/borkdude/clj-kondo/releases] \n"
           "4. File Watchers plugin for IntelliJ IDEA [https://github.com/borkdude/clj-kondo/blob/master/doc/editor-integration.md]"))

(-main)

(defn helpfulResources
  "This function will print all the resources that helped me get started"
  []
  (println "Here are the list of helpful resources: \n"
           "1. Intro [https://medium.com/hackernoon/clojure-functional-programming-38cc6a9298f5] \n"
           "2. Tooling and setup [https://www.youtube.com/watch?v=kjJVfoqFj_k] \n"
           "3. Debugging with REPL [https://www.youtube.com/watch?v=tpcl5pjkRTQ] \n"))

(helpfulResources)

(def mangoes 3)
(def oranges 5)
(def fruit (+ mangoes oranges))
(def avg-fruit (/ fruit 2))

(defn seconds-elapsed
  "Converts time from minutes to seconds"
  [minutes-elapsed]
  (println (* minutes-elapsed 60),"seconds"))

(defn mins-seconds-elapsed
  "Converts seconds into minutes and seconds"
  [seconds-elapsed]
  (println "Time elapsed is", (quot seconds-elapsed 60), "minutes &", (rem seconds-elapsed 60), "seconds"))

(mins-seconds-elapsed 200)

;(def wholesome-data ["Apple" 2 3.14 "Magic" :who])
(def wholesome-data [2 3.14])

(def high-temperature [27 24 23.1 19.5 18 16 14])

(def names {:king {:first "Cyprus" :age 75}, :queen {:first "Egypt" :age 64}})

(println (merge wholesome-data high-temperature))

(println (update-in names [:king :age] + 10))

; The real fun begins here
(defn double-operator
  "can either add or subtract"
  [operator x y]
  (println (operator x y)))

; Clojure uses prefix notation of + 3 2 instead of infix notation of 3 + 2
(double-operator * 3 2)

(defn concat-some
  [f vec1 vec2]
  ((fn [x] (filter f x))
   (concat vec1 vec2)))
(concat-some even? [1 2 3] [4 5 6])

(defn vector-output
  "Returns a vector of data passed"
  [a b c]
  (println [a b c]))

; () list [] vector #{} set w/ unique values {} maps w/ key value
(def visitor (atom []))

(defn hello-visitor
   "Save the visitor in an atom and retrieve it"
   [name]
   (swap! visitor conj name)
   (println "Hello, " name))

(hello-visitor "King")
(hello-visitor "Queen")
(hello-visitor "Queen")
(hello-visitor "Kong")

(println @visitor)

(def founder {"Lisp" "McCarthy" "Clojure" "Hickey"})
(println founder)

(require 'examples.introduction)
(take 10 examples.introduction/fibs)

(defrecord Book [title shelf])
(->Book "Programing Clojure" "Code")

; To run the project in REPL - Right click on project.clj and click on *Run 'REPL for Hello'*
; CMD+SHIFT+L loads the current file in the REPL