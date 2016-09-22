# Epsilon Haetae

Epsilon Haetae is an extensible static analysis framework for the Epsilon platform, supporting Epsilon version 1.3 up until now.

Haetae currently supports the static analysis (and other functionalities) for EOL, EVL and ETL.

Haetae consists a number of components:

1. EOL, EVL and ETL metamodels. The approach that Haetae adopts is to convert programs written in Epsilon languages into analysable representations. The premise for this approach is to have the metamodels of Epsilon languages. Currently, Haetae provides metamodels for EOL, EVL and ETL.

2. AST2ExL transformations. Epsilon uses an ANTLR-based parser, which converts programs (raw Strings) into homogeneous abstract syntax trees (ASTs). Haetae makes use of ASTs and transform them into EOL, EVL or ETL (and more to come) models that conform to the aforementioned metamodels.

3. EOL visitor. EOL, EVL and ETL visitor frameworks are automatically generated from their corresponding metamodels. The EOL visitor facility allows the developers to traverse EOL (EVL and ETL) models with their own algorithms so that different functionalities can be achieved. 

4. EOL variable resolver. The first step of static analysis is to resolve what is called the ''reaching definition'' of variables, i.e. establishing the links between variable declarations and variable references. Warnings and Errors are reported via the LogBook facility (org.eclipse.epsilon.haetae.problem) and can be extracted to be used in any way.

5. EOL type resolver. The next step of static anaylsis is to resolve the types of expressions. Haetae adopts a naive approach fo type resolution  (due to the nature of Epsilon languages - dynamically typed with weak typing) - the user should be descreet of the use of Any type in Epsilon. When an expression (denoted by E) with Any type is assigned a type in the first instance, Haetae keeps track of this type until the expression is assigned another type, beyond this point, there is no guarantee that Haetae will resolve the types of the expressions involving the usage of E. Thus, it is recommended to use Any type as descreetly as possible.

Haetae development tool (org.eclipse.epsilon.haetae.dt) contributes to the Eclipse menus, when right clicking on .eol/.evl/.etl files, under ''Epsilon Haetae'' the user is able to transform such files into models, variable-resolved models or type resolved models. Please be noted that some type information cannot be persisted due to their links to EMF native types (and therefore declared as derived and transient), so that it is recommended whoever uses the type resolved models to derive the type with the information provided in the type-resolved models.

Haetae also contributes to Eclipse preference pages. In ''Preference'' -> ''Epsilon Haetae" -> tick ''Enable Epsilon Haetae (experimental)'' will trigger Epsilon Haetae to take effect, so that warnings and errors are reported directly in Epsilon editors. Please be noted that in order for Haetae to work, you'll need to declare the metamodels used in the program in the following form:

    model .. driver .. {nsuri=".."}
For example, if we want to declare Ecore using EMF driver:

    model Ecore driver EMF {nsuri="http://www.eclipse.org/emf/2002/Ecore"};

Haetae currently adopts a conservative approach in error detection - Haetae is able to determine the type of an expression (of which its type is implicit - via the use of Any type) if the type of the value of the expression throughout the entire program do not change. 

For example:

    var a = 1;
    a.println();

at line 2 Haetae would determine that expressions a and a.println() both have the type Integer.

However, if the type of the expression change throughout the program, Haetae would adopt a conservative approach:

    var a = 1;
    var b = "hello world";
    if(a > 0)
    {
        b = 3.14;
    }
    b.println();

In this example, the value of b changes from "hello world" to 3.14 when the program execution enters into the if statement. Although from manual inspection it is clear that the expression b.println() is Real, Haetae still resolves its type to Any. 

The implication is that the users of Epsilon should be cautious when using Any - at least, if the user does not declare a type for an expression (denoted by e), and gives it a value of type t. Then throughout the entire program, the user should assign values to e of type either t or a subtype of t. By doing so, the source code is cleaner which makes debugging easier.

#Update Site
https://raw.githubusercontent.com/epsilonlabs/haetae/gh-pages/org.eclipse.epsilon.haetae.updatesite/site.xml

#Applications of Static Analysis

1. Haetae is used in many occasions to help solve many problems, one example would be the use to address the scalability problem in loading XMI models ([SmartSAX](https://github.com/wrwei/SmartSAX)). In this instance, an effective metamodel extraction facility is built by extending Haetae so that metamodel footprint of queries/transformations can be automatically extracted by Haetae. 

#Bug report
There are currently a number of bugs introduced due to the refacotring of EOL metamodel, please report if you encounter any.

#Lesson learnt
Do NOT trust egit
