# Success log:
```
$ mvn clean test
[INFO] Scanning for projects...
[INFO] 
[INFO] --------------------< warren30815:A082608-CI-test- >--------------------
[INFO] Building A082608-CI-test- 0.0.1-SNAPSHOT
[INFO] --------------------------------[ jar ]---------------------------------
Downloading from google-maven-central: https://maven-central.storage-download.googleapis.com/maven2/org/apache/maven/plugins/maven-clean-plugin/2.5/maven-clean-plugin-2.5.pom
Downloaded from google-maven-central: https://maven-central.storage-download.googleapis.com/maven2/org/apache/maven/plugins/maven-clean-plugin/2.5/maven-clean-plugin-2.5.pom (3.9 kB at 8.3 kB/s)
Downloading from google-maven-central: https://maven-central.storage-download.googleapis.com/maven2/org/apache/maven/plugins/maven-clean-plugin/2.5/maven-clean-plugin-2.5.jar
Downloaded from google-maven-central: https://maven-central.storage-download.googleapis.com/maven2/org/apache/maven/plugins/maven-clean-plugin/2.5/maven-clean-plugin-2.5.jar (25 kB at 149 kB/s)
[INFO] 
[INFO] --- maven-clean-plugin:2.5:clean (default-clean) @ A082608-CI-test- ---
[INFO] Deleting /home/travis/build/warren30815/A082608-CI-test-/target
[INFO] 
[INFO] --- jacoco-maven-plugin:0.8.5:prepare-agent (default) @ A082608-CI-test- ---
[INFO] argLine set to -javaagent:/home/travis/.m2/repository/org/jacoco/org.jacoco.agent/0.8.5/org.jacoco.agent-0.8.5-runtime.jar=destfile=/home/travis/build/warren30815/A082608-CI-test-/target/jacoco.exec
[INFO] 
[INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ A082608-CI-test- ---
[WARNING] Using platform encoding (UTF-8 actually) to copy filtered resources, i.e. build is platform dependent!
[INFO] skip non existing resourceDirectory /home/travis/build/warren30815/A082608-CI-test-/src/main/resources
[INFO] 
[INFO] --- maven-compiler-plugin:3.8.1:compile (default-compile) @ A082608-CI-test- ---
[INFO] No sources to compile
[INFO] 
[INFO] --- maven-resources-plugin:2.6:testResources (default-testResources) @ A082608-CI-test- ---
[WARNING] Using platform encoding (UTF-8 actually) to copy filtered resources, i.e. build is platform dependent!
[INFO] skip non existing resourceDirectory /home/travis/build/warren30815/A082608-CI-test-/src/test/resources
[INFO] 
[INFO] --- maven-compiler-plugin:3.8.1:testCompile (default-testCompile) @ A082608-CI-test- ---
[INFO] Changes detected - recompiling the module!
[WARNING] File encoding has not been set, using platform encoding UTF-8, i.e. build is platform dependent!
[INFO] Compiling 1 source file to /home/travis/build/warren30815/A082608-CI-test-/target/test-classes
[INFO] /home/travis/build/warren30815/A082608-CI-test-/src/test/java/warren30815/A082608-CI-test-/PriorityQueueTest.java: /home/travis/build/warren30815/A082608-CI-test-/src/test/java/warren30815/A082608-CI-test-/PriorityQueueTest.java uses unchecked or unsafe operations.
[INFO] /home/travis/build/warren30815/A082608-CI-test-/src/test/java/warren30815/A082608-CI-test-/PriorityQueueTest.java: Recompile with -Xlint:unchecked for details.
[INFO] 
[INFO] --- maven-surefire-plugin:2.12.4:test (default-test) @ A082608-CI-test- ---
[INFO] Surefire report directory: /home/travis/build/warren30815/A082608-CI-test-/target/surefire-reports
Downloading from google-maven-central: https://maven-central.storage-download.googleapis.com/maven2/org/apache/maven/surefire/surefire-junit4/2.12.4/surefire-junit4-2.12.4.pom
Downloaded from google-maven-central: https://maven-central.storage-download.googleapis.com/maven2/org/apache/maven/surefire/surefire-junit4/2.12.4/surefire-junit4-2.12.4.pom (2.4 kB at 69 kB/s)
Downloading from google-maven-central: https://maven-central.storage-download.googleapis.com/maven2/org/apache/maven/surefire/surefire-providers/2.12.4/surefire-providers-2.12.4.pom
Downloaded from google-maven-central: https://maven-central.storage-download.googleapis.com/maven2/org/apache/maven/surefire/surefire-providers/2.12.4/surefire-providers-2.12.4.pom (2.3 kB at 60 kB/s)
Downloading from google-maven-central: https://maven-central.storage-download.googleapis.com/maven2/org/apache/maven/surefire/surefire-junit4/2.12.4/surefire-junit4-2.12.4.jar
Downloaded from google-maven-central: https://maven-central.storage-download.googleapis.com/maven2/org/apache/maven/surefire/surefire-junit4/2.12.4/surefire-junit4-2.12.4.jar (37 kB at 1.1 MB/s)
-------------------------------------------------------
 T E S T S
-------------------------------------------------------
Running PriorityQueueTest
Tests run: 20, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.273 sec
Results :
Tests run: 20, Failures: 0, Errors: 0, Skipped: 0
[INFO] 
[INFO] --- jacoco-maven-plugin:0.8.5:report (report) @ A082608-CI-test- ---
[INFO] Skipping JaCoCo execution due to missing classes directory.
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  4.288 s
[INFO] Finished at: 2020-04-09T08:57:04Z
[INFO] ------------------------------------------------------------------------
The command "mvn clean test" exited with 0.
Done. Your build exited with 0.
```

# Fail log:
```
5.11s$ mvn clean test
[INFO] Scanning for projects...
[INFO] 
[INFO] --------------------< warren30815:A082608-CI-test- >--------------------
[INFO] Building A082608-CI-test- 0.0.1-SNAPSHOT
[INFO] --------------------------------[ jar ]---------------------------------
Downloading from google-maven-central: https://maven-central.storage-download.googleapis.com/maven2/org/apache/maven/plugins/maven-clean-plugin/2.5/maven-clean-plugin-2.5.pom
Downloaded from google-maven-central: https://maven-central.storage-download.googleapis.com/maven2/org/apache/maven/plugins/maven-clean-plugin/2.5/maven-clean-plugin-2.5.pom (3.9 kB at 8.4 kB/s)
Downloading from google-maven-central: https://maven-central.storage-download.googleapis.com/maven2/org/apache/maven/plugins/maven-clean-plugin/2.5/maven-clean-plugin-2.5.jar
Downloaded from google-maven-central: https://maven-central.storage-download.googleapis.com/maven2/org/apache/maven/plugins/maven-clean-plugin/2.5/maven-clean-plugin-2.5.jar (25 kB at 337 kB/s)
[INFO] 
[INFO] --- maven-clean-plugin:2.5:clean (default-clean) @ A082608-CI-test- ---
[INFO] Deleting /home/travis/build/warren30815/A082608-CI-test-/target
[INFO] 
[INFO] --- jacoco-maven-plugin:0.8.5:prepare-agent (default) @ A082608-CI-test- ---
[INFO] argLine set to -javaagent:/home/travis/.m2/repository/org/jacoco/org.jacoco.agent/0.8.5/org.jacoco.agent-0.8.5-runtime.jar=destfile=/home/travis/build/warren30815/A082608-CI-test-/target/jacoco.exec
[INFO] 
[INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ A082608-CI-test- ---
[WARNING] Using platform encoding (UTF-8 actually) to copy filtered resources, i.e. build is platform dependent!
[INFO] skip non existing resourceDirectory /home/travis/build/warren30815/A082608-CI-test-/src/main/resources
[INFO] 
[INFO] --- maven-compiler-plugin:3.8.1:compile (default-compile) @ A082608-CI-test- ---
[INFO] No sources to compile
[INFO] 
[INFO] --- maven-resources-plugin:2.6:testResources (default-testResources) @ A082608-CI-test- ---
[WARNING] Using platform encoding (UTF-8 actually) to copy filtered resources, i.e. build is platform dependent!
[INFO] skip non existing resourceDirectory /home/travis/build/warren30815/A082608-CI-test-/src/test/resources
[INFO] 
[INFO] --- maven-compiler-plugin:3.8.1:testCompile (default-testCompile) @ A082608-CI-test- ---
[INFO] Changes detected - recompiling the module!
[WARNING] File encoding has not been set, using platform encoding UTF-8, i.e. build is platform dependent!
[INFO] Compiling 1 source file to /home/travis/build/warren30815/A082608-CI-test-/target/test-classes
[INFO] /home/travis/build/warren30815/A082608-CI-test-/src/test/java/warren30815/A082608-CI-test-/PriorityQueueTest.java: /home/travis/build/warren30815/A082608-CI-test-/src/test/java/warren30815/A082608-CI-test-/PriorityQueueTest.java uses unchecked or unsafe operations.
[INFO] /home/travis/build/warren30815/A082608-CI-test-/src/test/java/warren30815/A082608-CI-test-/PriorityQueueTest.java: Recompile with -Xlint:unchecked for details.
[INFO] 
[INFO] --- maven-surefire-plugin:2.12.4:test (default-test) @ A082608-CI-test- ---
[INFO] Surefire report directory: /home/travis/build/warren30815/A082608-CI-test-/target/surefire-reports
Downloading from google-maven-central: https://maven-central.storage-download.googleapis.com/maven2/org/apache/maven/surefire/surefire-junit4/2.12.4/surefire-junit4-2.12.4.pom
Downloaded from google-maven-central: https://maven-central.storage-download.googleapis.com/maven2/org/apache/maven/surefire/surefire-junit4/2.12.4/surefire-junit4-2.12.4.pom (2.4 kB at 161 kB/s)
Downloading from google-maven-central: https://maven-central.storage-download.googleapis.com/maven2/org/apache/maven/surefire/surefire-providers/2.12.4/surefire-providers-2.12.4.pom
Downloaded from google-maven-central: https://maven-central.storage-download.googleapis.com/maven2/org/apache/maven/surefire/surefire-providers/2.12.4/surefire-providers-2.12.4.pom (2.3 kB at 45 kB/s)
Downloading from google-maven-central: https://maven-central.storage-download.googleapis.com/maven2/org/apache/maven/surefire/surefire-junit4/2.12.4/surefire-junit4-2.12.4.jar
Downloaded from google-maven-central: https://maven-central.storage-download.googleapis.com/maven2/org/apache/maven/surefire/surefire-junit4/2.12.4/surefire-junit4-2.12.4.jar (37 kB at 467 kB/s)
-------------------------------------------------------
 T E S T S
-------------------------------------------------------
Running PriorityQueueTest
Tests run: 20, Failures: 1, Errors: 0, Skipped: 0, Time elapsed: 0.219 sec <<< FAILURE!
testParameterization[4](PriorityQueueTest)  Time elapsed: 0.029 sec  <<< FAILURE!
java.lang.AssertionError: expected:<5> but was:<4>
	at org.junit.Assert.fail(Assert.java:89)
	at org.junit.Assert.failNotEquals(Assert.java:835)
	at org.junit.Assert.assertEquals(Assert.java:120)
	at org.junit.Assert.assertEquals(Assert.java:146)
	at PriorityQueueTest.testParameterization(PriorityQueueTest.java:63)
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(Method.java:498)
	at org.junit.runners.model.FrameworkMethod$1.runReflectiveCall(FrameworkMethod.java:59)
	at org.junit.internal.runners.model.ReflectiveCallable.run(ReflectiveCallable.java:12)
	at org.junit.runners.model.FrameworkMethod.invokeExplosively(FrameworkMethod.java:56)
	at org.junit.internal.runners.statements.InvokeMethod.evaluate(InvokeMethod.java:17)
	at org.junit.runners.ParentRunner$3.evaluate(ParentRunner.java:306)
	at org.junit.runners.BlockJUnit4ClassRunner$1.evaluate(BlockJUnit4ClassRunner.java:100)
	at org.junit.runners.ParentRunner.runLeaf(ParentRunner.java:366)
	at org.junit.runners.BlockJUnit4ClassRunner.runChild(BlockJUnit4ClassRunner.java:103)
	at org.junit.runners.BlockJUnit4ClassRunner.runChild(BlockJUnit4ClassRunner.java:63)
	at org.junit.runners.ParentRunner$4.run(ParentRunner.java:331)
	at org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:79)
	at org.junit.runners.ParentRunner.runChildren(ParentRunner.java:329)
	at org.junit.runners.ParentRunner.access$100(ParentRunner.java:66)
	at org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:293)
	at org.junit.runners.ParentRunner.run(ParentRunner.java:413)
	at org.junit.runners.Suite.runChild(Suite.java:128)
	at org.junit.runners.Suite.runChild(Suite.java:27)
	at org.junit.runners.ParentRunner$4.run(ParentRunner.java:331)
	at org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:79)
	at org.junit.runners.ParentRunner.runChildren(ParentRunner.java:329)
	at org.junit.runners.ParentRunner.access$100(ParentRunner.java:66)
	at org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:293)
	at org.junit.runners.ParentRunner$3.evaluate(ParentRunner.java:306)
	at org.junit.runners.ParentRunner.run(ParentRunner.java:413)
	at org.apache.maven.surefire.junit4.JUnit4Provider.execute(JUnit4Provider.java:252)
	at org.apache.maven.surefire.junit4.JUnit4Provider.executeTestSet(JUnit4Provider.java:141)
	at org.apache.maven.surefire.junit4.JUnit4Provider.invoke(JUnit4Provider.java:112)
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(Method.java:498)
	at org.apache.maven.surefire.util.ReflectionUtils.invokeMethodWithArray(ReflectionUtils.java:189)
	at org.apache.maven.surefire.booter.ProviderFactory$ProviderProxy.invoke(ProviderFactory.java:165)
	at org.apache.maven.surefire.booter.ProviderFactory.invokeProvider(ProviderFactory.java:85)
	at org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:115)
	at org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:75)
Results :
Failed tests:   testParameterization[4](PriorityQueueTest): expected:<5> but was:<4>
Tests run: 20, Failures: 1, Errors: 0, Skipped: 0
[INFO] ------------------------------------------------------------------------
[INFO] BUILD FAILURE
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  3.787 s
[INFO] Finished at: 2020-04-09T08:59:54Z
[INFO] ------------------------------------------------------------------------
[ERROR] Failed to execute goal org.apache.maven.plugins:maven-surefire-plugin:2.12.4:test (default-test) on project A082608-CI-test-: There are test failures.
[ERROR] 
[ERROR] Please refer to /home/travis/build/warren30815/A082608-CI-test-/target/surefire-reports for the individual test results.
[ERROR] -> [Help 1]
[ERROR] 
[ERROR] To see the full stack trace of the errors, re-run Maven with the -e switch.
[ERROR] Re-run Maven using the -X switch to enable full debug logging.
[ERROR] 
[ERROR] For more information about the errors and possible solutions, please read the following articles:
[ERROR] [Help 1] http://cwiki.apache.org/confluence/display/MAVEN/MojoFailureException
The command "mvn clean test" exited with 1.
Done. Your build exited with 1.
```
