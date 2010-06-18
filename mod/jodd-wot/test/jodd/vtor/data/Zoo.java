package jodd.vtor.data;

import jodd.vtor.constraint.MinLength;

public class Zoo {

	@MinLength(value = 5, profiles = {"p1"})
	String aaa = "a";

	@MinLength(value = 5, profiles = {"p1", "p2"})
	String bbb = "b";

	@MinLength(value = 5)
	String ccc = "c";
}