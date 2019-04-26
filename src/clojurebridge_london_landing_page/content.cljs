(ns clojurebridge-london-landing-page.content)

;; Content for the ClojureBridge London website





(defn register
  "Component for signing up to the event, including the date of the current event"
  []
  [:div {:class "columns"}
   [:div {:class "column"}
    [:a {:class "button is-black is-medium is-outlined is-rounded"
         :href  "https://www.bridgetroll.org/events/471"}
     "Signup for the next event"]
    [:div {:class "column"}
     [:strong "10th/11th May 2019 @ Functional Works, London"]
     [:p "Coach training 2nd May"]]]])


(defn install
  "How to install Clojure on your computer

  TODO: add a selector for operating system and only show the relevant content"
  []
  [:div {:class "container"}
   [:div {:class "box"
          :id    "install"}
    [:div {:class "columns"}
     [:div {:class "column"}
      [:figure {:class "image is-128x128"}
       [:img {:src "https://clojure.org/images/clojure-logo-120b.png"}]]]
     [:div {:class "column"}
      [:div {:class "content"}
       [:h2 "Clojure Install"]
       [:p "If you are taking the learning path to build a website, game or app with a coach,
           then you should install Clojure on your laptop."]
       [:p "The "
        [:a {:href   "https://clojurebridgelondon.github.io/workshop/development-tools/"
             :target "_blank"}
         "Clojure development environment guides"]
        " show you how to do this for Linux, MacOSX and Windows."]]]]]])


(defn learning-paths
  "Learning paths for Students of ClojureBridge"
  []
  [:div {:class "container"
         :id    "learning-paths"}
   [:div {:class "box"}
    [:div {:class "columns"}
     [:div {:class "column"}
      [:figure {:class "image"}
       [:img {:src "images/learning-paths-banner.jpg"}]]]
     [:div {:class "column"}
      [:div {:class "content"}
       [:h2 "Learning Paths"]
       [:p "Students can choose their own path in learning Clojure and we have put together content at three different levels"]
       [:ul
        [:li
         [:strong "Absolute Beginner"] " - have a conversation with your computer using colours and shapes"]
        [:li
         [:strong "A little coding experience"] " - tackle some simple challenges"]
        [:li
         [:strong "Some experience coding"] " - build a website, app or game with a coach"]]

       [:p "Every student is paired with a coach who will support them through the workshop, helping them to relate to the concepts covered and
coaching them in the art of coding."]
       ]]]]])



(defn showcase
  "Learning paths for Students of ClojureBridge

  container style adds left/right margin
  box add shadow and padding around content"
  []
  [:div {:class "container"}
   [:div {:class "box"
          :id    "showcase"}
    [:div {:class "columns"}
     [:div {:class "column"}
      [:figure {:class "image is-128x128"}
       [:img {:src "https://clojure.org/images/clojure-logo-120b.png"}]]]
     [:div {:class "column"}
      [:div {:class "content"}
       [:h2 "Clojure Showcase"]
       [:p "Examples of just what Clojure can do"]]]]]])


(defn schedule
  "Learning paths for Students of ClojureBridge"
  []
  [:div {:class "container"
         :id    "schedule"}
   [:div {:class "box"}
    [:div {:class "columns"}
     [:div {:class "column"}
      [:figure {:class "image is-128x128"}
       [:img {:src "https://clojure.org/images/clojure-logo-120b.png"}]]]

     [:div {:class "column"}
      [:div {:class "content"}
       [:h2 "ClojureBridge Schedule"]
       [:h3 "Friday Evening"]
       [:ul
        [:li
         [:strong "18:30: "] "Doors open & food"]
        [:li
         [:strong "19:00: "] "Introducing ClojureBridge & Clojure"]
        [:li
         [:strong "19:45: "] "Pair with Coach / choose a workshop"]
        [:li
         [:strong "20:30: "] "Wrap up"]]]]

     [:div {:class "column"}
      [:div {:class "content"}
       [:h3 "Saturday"]
       [:ul
        [:li
         [:strong "10:30: "] "Doors open & breakfast"]
        [:li
         [:strong "11:00: "] "Workshop starts"]
        [:li
         [:strong "13:15: "] "Group Share - what have we learnt so far"]
        [:li
         [:strong "13:30: "] "Lunch"]
        [:li
         [:strong "14:30: "] "Continue workshop"]
        [:li
         [:strong "16:30: "] "Retrospective - capturing feedback"]
        [:li
         [:strong "17:00: "] "Wrap up"]]]]]]])



(defn overview
  "Overview of ClojureBridge"
  []
  [:div {:class "container"
         :id    "overview"}
   [:div {:class "box"}
    [:div {:class "columns"}
     [:div {:class "column"}
      [:figure {:class "image"}
       [:img {:src "images/clojurebridge-diversity-2015.png"}]]]
     [:div {:class "column"}
      [:div {:class "content"}
       [:h2 "ClojureBridge overview "]
       [:p "Fun, free and friendly workshops for those identifying as women or non-binary gender."]
       [:p "Every student is paired with a coach who will support them through the workshop, helping them to relate to the concepts covered and
coaching them in the art of coding."]
       [:p "We teach students Clojure, a functional programming language that is great for beginners and experienced developers alike.  Find out " [:a {:href "#why-clojure"} "why Clojure is a great language to learn."]]
       [:p "Students can choose their own path in learning Clojure and we have put together content at different experience levels of experience."]
       ]]]]])


(defn navigation-top
  ""
  []
  ;; Navigation bar (responsive)
  [:nav {:class      "navbar is-fixed-top is-dark"
         :role       "navigation"
         :aria-label "main navigation"}
   [:div {:class "container"}
    [:div {:class "navbar-brand"}
     [:a {:class "navbar-item"
          :href  "/"}
      [:img {:src "images/clojurebridge-logo.png"}]]
     [:span {:class       "navbar-burger burger"
             :data-target "navbarClojureBridge"}
      ;; Empty spans needed for navbar burger
      [:span][:span][:span]]]
    [:div {:id    "navbarClojureBridge"
           :class "navbar-menu"}
     [:div {:class "navbar-start"}
      [:a {:class "navbar-item"
           :href  "#overview"} "Overview"]
      [:a {:class "navbar-item"
           :href  "#showcase"} "Showcase"]
      [:a {:class "navbar-item"
           :href  "#learning-paths"} "Learning Paths"]
      [:a {:class "navbar-item"
           :href  "#install"} "Install"]
      [:a {:class "navbar-item"
           :href  "#resources"} "Resources"]
      [:a {:class "navbar-item"
           :href  "#resources"} "Coaches"]
      [:a {:class "navbar-item"
           :href  "#sponsors"} "Sponsors"]
      [:span {:class "navbar-item"}
       [:a {:class "button is-inverted"
            :href  "https://github.com/clojurebridgelondon"}
        [:span {:class "icon"}
         [:i {:class "fab fa-github"}]]
        [:span "Issues/PRs"]]]]]]]
  )



(defn hero-banner
  "Top banner and navigation for the website"
  []
  [:div {:class "hero is-small"}

   ;; Tob banner title and subtitle
   [:div {:class "hero-body"}
    [:div {:class "container"}
     [:h1 {:class "title"}
      "ClojureBridge London"]
     [:p {:class "subtitle"}
      "Fun, Friendly, Free workshop for Women and non-binary genders"]
     [register]]]])
