logLevel := Level.Warn

resolvers ++= Seq(
  "search.maven repository" at "https://search.maven.org",
  "Typesafe repository" at "http://dl.bintray.com/typesafe/maven-releases/",
  "Aliyun repository" at "http://maven.aliyun.com/nexus/content/groups/public/",
  "oss snapshots-repo" at "https://oss.sonatype.org/content/repositories/snapshots"
//  ,Resolver.mavenLocal
)

addSbtPlugin("com.eed3si9n" % "sbt-assembly" % "0.14.9")

//addSbtPlugin("com.typesafe.sbteclipse" % "sbteclipse-plugin" % "5.2.4")

addSbtPlugin("net.virtual-void" % "sbt-dependency-graph" % "0.9.2")
addSbtPlugin("com.github.mpeltonen" % "sbt-idea" % "1.6.0")


//addCompilerPlugin("ch.epfl.scala" %% "scalac-profiling" % "1.0.0")

//addSbtPlugin("com.typesafe.sbt" % "sbt-native-packager" % "1.3.7")

addSbtPlugin("org.scalastyle" % "scalastyle-sbt-plugin" % "1.0.0")
addSbtPlugin("uk.co.josephearl" % "sbt-findbugs" % "2.4.3")
addSbtPlugin("com.etsy" % "sbt-checkstyle-plugin" % "3.1.1")
addSbtPlugin("org.scalariform" % "sbt-scalariform" % "1.8.2")

addSbtPlugin("com.delprks" % "sbt-trace" % "1.0.0")
addSbtPlugin("com.github.xuwei-k" % "sbt-class-diagram" % "0.2.1")
addSbtPlugin("io.shaka" % "sbt-dist-zip" % "10")

//addSbtPlugin("com.typesafe.sbt" % "sbt-git" % "0.9.3")
//addSbtPlugin("org.scala-sbt.plugins" % "sbt-onejar" % "0.8")

//addSbtPlugin("com.github.hochgi" % "sbt-cassandra"   % "0.9.1")
//addSbtPlugin("com.localytics" % "sbt-s3" % "1.0.0")
//addSbtPlugin("com.localytics" % "sbt-dynamodb" % "2.0.3")
//addSbtPlugin("io.tailrec.sbt" % "sbt-aws-fun" % "0.6.0")//enablePlugins(AwsFunPlugin)

//addSbtPlugin("io.spray" % "sbt-revolver" % "0.9.1")
//addSbtPlugin("com.earldouglas" % "xsbt-web-plugin" % "4.0.2"//enablePlugins(JettyPlugin)
//addSbtPlugin("com.github.yoshiyoshifujii" % "sbt-aws-serverless" % "4.1.0")//enablePlugins(ServerlessPlugin)
//addSbtPlugin("com.eed3si9n" % "sbt-unidoc" % "0.4.2")
//addSbtPlugin("com.github.sbt" % "sbt-jacoco" % "3.1.0")
//addSbtPlugin("org.xerial.sbt" % "sbt-pack" % "0.9.3")
//addSbtPlugin("com.codacy" % "sbt-codacy-coverage" % "1.3.11")
//addSbtPlugin("de.johoop" % "sbt-testng-plugin" % "3.1.1")
//addSbtPlugin("org.scoverage" % "sbt-scoverage" % "1.5.1")
//addSbtPlugin("com.jsuereth" % "sbt-pgp" % "1.1.0")