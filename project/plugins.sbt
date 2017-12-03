addSbtPlugin("com.dwijnand"      % "sbt-travisci"        % "1.1.1")
addSbtPlugin("com.lucidchart"    % "sbt-scalafmt"        % "1.14")
addSbtPlugin("com.thesamet"      % "sbt-protoc"          % "0.99.13")
addSbtPlugin("com.typesafe.sbt"  % "sbt-git"             % "0.9.3")
addSbtPlugin("com.typesafe.sbt"  % "sbt-native-packager" % "1.3.2")
addSbtPlugin("de.heikoseeberger" % "sbt-header"          % "4.0.0")

libraryDependencies ++= Seq(
  "com.trueaccord.scalapb" %% "compilerplugin" % "0.6.7",
  "org.slf4j"              % "slf4j-nop"       % "1.7.25" // Needed by sbt-git
)