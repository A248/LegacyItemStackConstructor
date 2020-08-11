# LegacyItemStackConstructor
A very simple project for using Spigot's deprecated/removed ItemStack(int, int, short) constructor in multi-version plugins.

## Introduction

You may be developing a Spigot plugin with support for multiple versions. You want to support MC 1.8. To do this, you need to call the constructor `ItemStack(int, int, short)` for *1.8.8 only*. However, the rest of your plugin must build against a newer version of Spigot. The constructor doesn't exist in newer versions.

A really painful solution is described [here](https://github.com/pablo67340/GUIShop/pull/44#issuecomment-601844449) – a disjointed build process which is very frustrating.

## The Solution

**1.** Add the following dependency to your pom.xml:
```xml
<dependency>
	<groupId>space.arim</groupId>
	<artifactId>legacyitemconstructor</artifactId>
	<version>0.1.2-SNAPSHOT</version>
	<optional>true</optional> <!-- Prevents transitivity -->
</dependency>
```

**2.** Add the following repository:
```xml
<repository>
	<id>arim-mvn-lgpl3</id>
	<url>https://mvn-repo.arim.space/lesser-gpl3/</url>
</repository>
```

**3.** Shade the dependency using maven-shade-plugin:
```xml
<plugin>
	<groupId>org.apache.maven.plugins</groupId>
	<artifactId>maven-shade-plugin</artifactId>
	<executions>
		<execution>
			<phase>package</phase>
			<goals>
				<goal>shade</goal>
			</goals>
			<configuration>
				<artifactSet>
					<includes>
						<include>space.arim:legacyitemconstructor</include>
					</includes>
				</artifactSet>
			</configuration>
		</execution>
	</executions>
</plugin>
```

**4.** Call the appropriate method:
```java
int type, amount;
short damage;
ItemStack legacyResolvedItem = LegacyItemConstructor.invoke(type, amount, damage);
```
