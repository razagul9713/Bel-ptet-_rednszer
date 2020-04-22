public class Program{
	public static void main(String[]args){
		
	}
}

interface Ember{
	String getNev();
	int getSzülido();
}


abstract class Robot{
	String ID;
	int memoria;
	public Robot(String ID, int memoria){
		this.ID = ID;
		this.memoria = memoria;
	}
	public String getID(){return ID;}
	public getMemoria(){return memoria;}
}


class Robot_to_Ember implements Ember{
	Robot myRobot;
	String nev;
	public Robot_to_Ember(Robot myRobot){
		this.myRobot = myRobot;
	}
	public int getIQ(){
		return myRobot.getMemoria()/2048;
	}
	public String getNev(){
		return "RobotID: " + myRobot.getID();
	}
}


abstract class Textúra extends Robot{
	public abstract Stringk kiir();
}
class GyáriRobot extends Textúra{
	Robot gyariRobot;
	@Override
	public String kiir(){return "GyáriRobot";}
}

class RendörRobot extends Textúra{
	Robot rendorRobot;
	@Override
	public String kiir(){return "RendőrRobot";}
}

class HáziRobot extends Textúra{
	Robot haziRobot;
	@Override
	public String kiir(){return "HáziRobot";}
}


class IrodaiRobot extends Textúra{
	Robot irodaiRobot;
	@Override
	public String kiir(){return "IrodaiRobot";}
}

class SzereloRobot extends Textúra{
	Robot szereloRobot;
	@Override
	public String kiir(){return "SzerelőRobot";}
}
abstract class Ötvözet extends Textúra{
	protected Robot robot;
	public Ötvözet(Robot robot){this.robot = robot;}
	public String kiir()
	{ 
		return ötvözetKiir()+ robot.kiir();
	}
	public abstract String ötvözetKiir();
}
class GyáriTesztRobot extends Ötvözet{
	public TesztRobot(Robot robot){super(robot);}
	@Override
	public String ötvözetKiir(){return "GyáriTesztRobot";}
}
class RendörTesztRobot extends Ötvözet{
	public TesztRobot(Robot robot){super(robot);}
	@Override
	public String ötvözetKiir(){return "RendörTesztRobot";}
}
class HáziTesztRobot extends Ötvözet{
	public TesztRobot(Robot robot){super(robot);}
	@Override
	public String ötvözetKiir(){return "HáziTesztRobot";}
}
class IrodaiTesztRobot extends Ötvözet{
	public TesztRobot(Robot robot){super(robot);}
	@Override
	public String ötvözetKiir(){return "IrodaiTesztRobot";}
}
class SzereloTesztRobot extends Ötvözet{
	public TesztRobot(Robot robot){super(robot);}
	@Override
	public String ötvözetKiir(){return "SzereloTesztRobot";}
}
