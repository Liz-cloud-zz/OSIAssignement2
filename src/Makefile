JAVAC=	/usr/bin/javac
SRCDIR=	src
BINDIR=	bin
docdir=	./docs

.SUFFIXES:	.java	.class

.java.class:
	$(JAVAC)	$<

default:
	$(JAVAC)	-d	(BINDIR)	$(SRCDIR)/*.java
clean:
	rm	$(BINDIR)/*.class
run1:
	java	-cp	bin OS1Assignment
run2:
	java	-cp	bin OS1testsequence "/home/linda/Desktop/OSA1/OS1testsequence"
docs:
	javadoc	-d	$(docdir)	$(SRCDIR)

cleandocds:
	rm	-r	docs/*