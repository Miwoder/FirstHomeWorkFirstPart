Compile:
	
	javac -d ./classes ./src/courses/Main.java ./src/model/*

Run:
	
	java -classpath ./classes courses.Main

Work with jar:
	
	Create manifest.mf with

		main-class: courses.Main
		class-path: classes/

	jar -cmf manifest.mf firstHW.jar  -C classes .

	java -jar firstHW.jar

