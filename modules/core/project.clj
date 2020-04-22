(defproject cloudpermit/tilakone.core "0.0.5-SNAPSHOT"
  :description "Minimal finite state machine library"
  :url "https://github.com/cloudpermit/tilakone"
  :scm {:name "git", :url "https://github.com/cloudpermit/tilakone"}
  :dependencies []
  :license {:name "Eclipse Public License"
            :url  "http://www.eclipse.org/legal/epl-v10.html"}
  :deploy-repositories {"github" {:url           "https://maven.pkg.github.com/cloudpermit/tilakone"
                                  :username      :env/cloudpermit_github_username
                                  :password      :env/cloudpermit_github_token
                                  :sign-releases false}})
