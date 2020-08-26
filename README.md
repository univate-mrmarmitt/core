# Skalowsky's project cores
[![release-status](https://github.com/skalowsky/core/workflows/maven-deploy-release/badge.svg)](https://github.com/skalowsky/core/actions)
[![snapshot-status](https://github.com/skalowsky/core/workflows/maven-deploy-snapshot/badge.svg)](https://github.com/skalowsky/core/actions)

## Description
This project is a base pom to use as a parent to skalowsky projects.

### Using pom
```html
  <parent>
    <groupId>com.github.skalowsky</groupId>
    <artifactId>skalowsky-starter-config-server</artifactId>
    <version>0.1.0-SNAPSHOT</version>
    <relativePath/>
  </parent>
```
## Maven snapshot repository
You should add to the .m2/setings.xml the following tags to be able to download the snapshot version.
```html
<repository>
    <id>oss.sonatype.org-snapshot</id>
    <name>central-snapshot</name>
    <url>https://oss.sonatype.org/content/repositories/snapshots</url>
    <releases>
        <enabled>true</enabled>
    </releases>
    <snapshots>
        <enabled>true</enabled>
    </snapshots>
</repository>
```
 
