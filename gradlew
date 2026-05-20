#!/bin/sh

APP_PATH="$0"
while [ -h "$APP_PATH" ]; do
  LS="$(ls -ld "$APP_PATH")"
  LINK="$(expr "$LS" : '.*-> \(.*\)$')"
  if expr "$LINK" : '/.*' > /dev/null; then
    APP_PATH="$LINK"
  else
    APP_PATH="$(dirname "$APP_PATH")/$LINK"
  fi
done

APP_HOME="$(cd "$(dirname "$APP_PATH")" >/dev/null 2>&1 && pwd -P)" || exit 1
CLASSPATH="$APP_HOME/gradle/wrapper/gradle-wrapper.jar"

DEFAULT_JVM_OPTS='"-Xmx64m" "-Xms64m"'

eval "set -- $DEFAULT_JVM_OPTS $JAVA_OPTS $GRADLE_OPTS \"-Dorg.gradle.appname=gradlew\" -classpath \"\$CLASSPATH\" org.gradle.wrapper.GradleWrapperMain \"\$@\""
exec java "$@"
