public class Generic<Q> {
    Q genericThing;
    public Q genericMethod () {
        return /*must have return*/ genericThing;
    }

}


//need method qualifiers
//so void number methodHere() { }, number being a custom method qualifier

//Read document, if method contains method qualifier, run in a particular way!
//So basically, have it read the java document with a scanner. When it reads that the method
//    contains a particular qualifier, elsewhere defined, it will run the method based on
//    the newly created qualifier's specified properties and conditions.
//          Perhaps do this in the same class or package.

//    The *number* qualifier, for example, could be defined to count methodHere, so that if
//    a second method, say, =void number methodHere2=, were to run, it would count again, and
//    some generic number property would return the value 2.

//Here I was going to make something like public Matrix() {}; this indicates that specific
//code objects can be created instead of broad ones. So in general, any word can made as
//an equivalent to 'void' or 'Int', or even 'static', 'class', and 'public'. For example,
//finally, we could introduce something like: *useful class Generic<Q>* instead of *public class Generic<Q>*,
//so that |useful class| replaces |public class|. This means a megalarge number of qualifiers
//can be applied to various class types, such as String, or int, or even char...!