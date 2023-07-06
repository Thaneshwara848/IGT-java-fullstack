abstract class Emp
{
	abstract void empid();
	abstract void raisesal();
	abstract void cab();
	abstract void salary();
}
class clerk extends Emp{}
class Dev extends Emp{}
class Tester extends Emp{}
class Manager extends Emp{}

abstract class Univercity
{
	abstract void exam();
	abstrat void result();
}
class IIT  extends Univercity
{
	exam(){}
	result(){}
}
class NIT  extends Univercity
{	
	exam(){}
	result(){}
}
class AC  extends Univercity
{	
	exam(){}
	result(){}
}