#JCFLAGS = -target 1.1 #(is default)

zplet:
	javac $(JCFLAGS) -sourcepath $(PWD) -d ../classes russotto/zplet/Zplet.java
	touch $(HOME)/public_html/zplet/*.html

zjapp:
	javac $(JCFLAGS) -sourcepath $(PWD) -d ../classes russotto/zplet/ZJApp.java

clean:
	find ../classes -type f -exec rm "{}" \;	
	find . -name "*~" -exec rm "{}" \;
