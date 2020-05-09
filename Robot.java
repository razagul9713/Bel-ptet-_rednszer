package robot1;

/**
 *
 * @author Dani
 */
public class Robot1{

    
    public static void main(String[] args)  {
                Robot r1 = new GyáriRobot();
		System.out.println(r1);
		Robot r2 = new SzereloRobot();
		System.out.println(r2);
		Robot r3 = new RendörRobot();
		System.out.println(r3);
		Robot r4 = new HáziRobot();
		System.out.println(r4);
		Robot r5 = new IrodaiRobot();
		System.out.println(r5);
	        IWorkable workable = new Robot();
	        ISleepable sleepable = new Robot();
	        IWorker worker = new Robot();
    }
    
}

interface Ember{
	String getNev();
	String getNem();
	int getIQ();
	
}
interface ISzoftver{
	String[] getstoftvers = new String[]{KUKA, Windows, Linux};
}
interface IWorkable{
	void work();
}
interface ISleepable{
	void sleep();
}
interface IWorker implements IWorkable, ISleepable{
	
}


 abstract class Robot implements ISzoftver, IWorker {
	String ID;
	int memoria;
	String nem;
	String Szoftver;
	int teljesitmeny;
	String elv;
	public Robot(String ID, int memoria, String nem, int teljesitmeny, String elv){
		this.ID = ID;
		this.memoria = memoria;
		this.nem = nem;
		this.teljesitmeny=teljesitmeny;
		this.elv = elv;
		
	}
	public String getID(){return ID;}
	public int getMemoria(){return memoria;}
	public String getNem(){
		int nem = 0;
		if(nem == 0){
			return "Nő";
		}
		else {
			return "Férfi";
		}
            
	}
	public int getTeljesitmeny(){return teljesitmeny;}
	public String getElv(){
		String elv1 = "A robot nem okozhat kárt az emberi lényben";
		String elv2 = "A robot engedelmeskedni tartozik az ember utasításainak, kivéve ha ezek az utasítások ütköznének az első elvben leírtakkal.";
		String elv3 = "A robot saját védelméről gondoskodik amennyiben nem ütközik az első vagy második elvben leírtakkal.";
		if(elv1 == elv2 && elv1 == elv3 && elv2 == elv3){
			return "Az elvek megfelelnek";
		}
		else return "Nem megfelelőek az elvek";
			
	}
	 public void work();
	 public void sleep();
	 public String[] getSzoftvers(){
		 return Szoftver;
	 }
	 
    String kiir() {
	    return Robot;
    }
}


class Robot_to_Ember implements Ember{
	Robot myRobot;
	String nev;
	String nem;
	public Robot_to_Ember(Robot myRobot){
		this.myRobot = myRobot;
	}
	public int getIQ(){
		return myRobot.getMemoria()/2048;
	}
	public String getNev(){
		return "RobotID: " + myRobot.getID();
	}

    @Override
    public String getNem() {
        return "RobotNeme: " + myRobot.getNem();
    	}
}

abstract class Textúra extends Robot implements ISzoftver, IWorker{

	String Szoftver;
    public Textúra(String ID, int memoria, String nem, int teljesitmeny, String elv) {
        super(ID, memoria, nem, teljesitmeny, elv);
    }
	public abstract String kiir();
	public abstract String getID();
	public abstract int getMemoria();
	public abstract String getNem();
	public abstract int getTeljesitmeny();
	public abstract String getElv();
        public abstract Robot gyariRobot();
	public void work();
	public void sleep();
	 public String[] getSzoftvers(){
		 return Szoftver;
	 }	
}


 class GyáriRobot extends Textúra implements ISzoftver, IWorker{
    Robot gyariRobot;
    String Szoftver;
    public String kiir(Robot gyariRobot){return "GyáriRobot";}
    @Override
    public String getID() {
        return "ID:" + gyariRobot.getID();
    }

    @Override
    public int getMemoria() {
        return gyariRobot.getMemoria()/32768;
    }

    @Override
    public String getNem() {
        return "Nem:" + gyariRobot.getNem();
    }

    @Override
    public int getTeljesitmeny() {
        return gyariRobot.getTeljesitmeny();
    }

    @Override
    public String getElv() {
        return "Elv:" + gyariRobot.getElv();
    }
	 
    public void work();
    public void sleep();
    public String[] getSzoftvers(){
	 return Szoftver;
    }  
}


class RendörRobot extends Textúra implements ISzoftver, IWorker{
    Robot rendorRobot;
    String Szoftver;
    @Override
    public String getID() {
       return "RendörTesztRobot ID" + rendorRobot.getID();
    }

    @Override
    public int getMemoria() {
        return  rendorRobot.getMemoria()/16348;
    }

    @Override
    public String getNem() {
        return "RendörTesztRobot Neme" + rendorRobot.getNem();
    }

    @Override
    public int getTeljesitmeny() {
        return  rendorRobot.getTeljesitmeny();
    }

    @Override
    public String getElv() {
        return "RendörTesztRobot Elve: " + rendorRobot.getElv();
    }
    public void work();
    public void sleep();
    public String[] getSzoftvers(){
        return Szoftver;
    }
}

class HáziRobot extends Textúra implements ISzoftver, IWorker{
    Robot haziRobot;
    String Szoftver;
    @Override
    public String getID() {
       return "RendörTesztRobot ID" + haziRobot.getID();
    }

    @Override
    public int getMemoria() {
        return  haziRobot.getMemoria()/16348;
    }

    @Override
    public String getNem() {
        return "RendörTesztRobot Neme" + haziRobot.getNem();
    }

    @Override
    public int getTeljesitmeny() {
        return  haziRobot.getTeljesitmeny();
    }

    @Override
    public String getElv() {
        return "RendörTesztRobot Elve: " + haziRobot.getElv();
    }
    public void work();
    public void sleep();
    public String[] getSzoftvers(){
        return Szoftver;
    }   
}


class IrodaiRobot extends Textúra implements ISzoftver, IWorker{
    Robot irodaiRobot;
    String Szoftver;
    @Override
    public String getID() {
       return "RendörTesztRobot ID" + irodaiRobot.getID();
    }

    @Override
    public int getMemoria() {
        return  irodaiRobot.getMemoria()/16348;
    }

    @Override
    public String getNem() {
        return "RendörTesztRobot Neme" + irodaiRobot.getNem();
    }

    @Override
    public int getTeljesitmeny() {
        return  irodaiRobot.getTeljesitmeny();
    }

    @Override
    public String getElv() {
        return "RendörTesztRobot Elve: " + irodaiRobot.getElv();
    }
    public void work();
    public void sleep();
    public String[] getSzoftvers(){
        return Szoftver;
    } 
}

class SzereloRobot extends Textúra implements ISzoftver, IWorker{
    Robot szereloRobot;
    String Szoftver;
    @Override
    public String getID() {
       return "RendörTesztRobot ID" + szereloRobot.getID();
    }

    @Override
    public int getMemoria() {
        return  szereloRobot.getMemoria()/16348;
    }

    @Override
    public String getNem() {
        return "RendörTesztRobot Neme" + szereloRobot.getNem();
    }

    @Override
    public int getTeljesitmeny() {
        return  szereloRobot.getTeljesitmeny();
    }

    @Override
    public String getElv() {
        return "RendörTesztRobot Elve: " + szereloRobot.getElv();
    }
    public void work();
    public void sleep();
    public String[] getSzoftvers(){
	return Szoftver;
    } 
}

abstract class Ötvözet extends Textúra implements ISzoftver, IWorker{
	protected Robot robot;
	String Szoftver;
	public Ötvözet(String ID, int memoria, String nem, int teljesitmeny, String elv) {
        super(ID, memoria, nem, teljesitmeny, elv);
        
	public String kiir()
	{ 
		return ötvözetKiir()+ robot.kiir();
	}
	public String getID(){
		return ötvözetGetID() + robot.getID();
	}
	public int getMemoria(){
		return ötvözetGetMemoria() + robot.getMemoria();
	}
	public String getNem(){
		return ötvözetGetNem() + robot.getNem();
	}
	public int getTeljesitmeny(){
		return ötvözetGetTeljesitmeny() + robot.getTeljesitmeny();
	}
	public String getElv(){
		return ötvözetGetElv() + robot.getElv();
	}
	
	public abstract String ötvözetKiir();
	public abstract String ötvözetGetID();
	public abstract int ötvözetGetMemoria();
	public abstract String ötvözetGetNem();
	public abstract int ötvözetGetTeljesitmeny();
	public abstract String ötvözetGetElv();
	public void work();
	public void sleep();
   	public String[] getSzoftvers(){
	 	return Szoftver;
    }     
}

abstract class GyáriTesztRobot extends Ötvözet implements ISzoftver, IWorker{
	Robot GyáriTesztRobot(Robot robot){this.robot = robot;}
	String Szofver;
	@Override
	public String ötvözetKiir(){return "GyáriTesztRobot" + robot.kiir();}
	@Override
	public String ötvözetGetID(){return "GyáriTesztRobot ID" + robot.getID();}
	@Override
	public int ötvözetGetMemoria(){return  robot.getMemoria()/32768;}
	@Override
	public String ötvözetGetNem(){return "GyáriTesztRobot Neme" + robot.getNem();}
	@Override
	public int ötvözetGetTeljesitmeny(){return  robot.getTeljesitmeny();}
	@Override
	public String ötvözetGetElv(){return "GyáriTesztRobot Elve: " + robot.getElv();}
	public void work();
	public void sleep();
   	 public String[] getSzoftvers(){
		 return Szoftver;
    }
}
	
abstract class RendörTesztRobot extends Ötvözet implements ISzoftver, IWorker{
    
	Robot RendörTesztRobot(Robot robot){this.robot = robot;}
	String Szoftver;
	@Override
	public String ötvözetKiir(){return "RendörTesztRobot" + robot.kiir();}
	@Override
	public String ötvözetGetID(){return "RendörTesztRobot ID" + robot.getID();}
	@Override
	public int ötvözetGetMemoria(){return  + robot.getMemoria()/16348;}
	@Override
	public String ötvözetGetNem(){return "RendörTesztRobot Neme" + robot.getNem();}
	@Override
	public int ötvözetGetTeljesitmeny(){return  robot.getTeljesitmeny();}
	@Override
	public String ötvözetGetElv(){return "RendörTesztRobot Elve: " + robot.getElv();}
	public void work();
	public void sleep();
    	 public String[] getSzoftvers(){
	 	return Szoftver;
    }	
}
	
abstract class HáziTesztRobot extends Ötvözet implements ISzoftver, IWorker{
	Robot HáziTesztRobot(Robot robot){this.robot = robot;}
	String Szoftver;
	@Override
	public String ötvözetKiir(){return "HáziTesztRobot" + robot.kiir();}
	@Override
	public String ötvözetGetID(){return "HáziTesztRobot ID" + robot.getID();}
	@Override
	public int ötvözetGetMemoria(){return   robot.getMemoria()/4096;}
	@Override
	public String ötvözetGetNem(){return "HáziTesztRobot Neme" + robot.getNem();}
	@Override
	public int ötvözetGetTeljesitmeny(){return  robot.getTeljesitmeny();}
	@Override
	public String ötvözetGetElv(){return "HáziTesztRobot Elve: " + robot.getElv();}
	public void work();
	public void sleep();
    	 public String[] getSzoftvers(){
	 	return Szoftver;
    }	
}
	
abstract class IrodaiTesztRobot extends Ötvözet implements ISzoftver, IWorker{
	Robot IrodaiTesztRobot(Robot robot){this.robot =robot;}
	String Szoftver;
	@Override
	public String ötvözetKiir(){return "IrodaiTesztRobot" + robot.kiir();}
	@Override
	public String ötvözetGetID(){return "IrodaiTesztRobot ID" + robot.getID();}
	@Override
	public int ötvözetGetMemoria(){return  robot.getMemoria()/65536;}
	@Override
	public String ötvözetGetNem(){return "IrodaiTesztRobot Neme" + robot.getNem();}
	@Override
	public int ötvözetGetTeljesitmeny(){return   robot.getTeljesitmeny();}
	@Override
	public String ötvözetGetElv(){return "IrodaiTesztRobot Elve: " + robot.getElv();}
	public void work();
	public void sleep();
   	 public String[] getSzoftvers(){
		 return Szoftver;
    }
}
	
abstract class SzereloTesztRobot extends Ötvözet implements ISzoftver, IWorker{
	Robot  SzereloTesztRobot(Robot robot){this.robot = robot;}
	String Szoftver;
	@Override
	public String ötvözetKiir(){return "SzereloTesztRobot" + robot.kiir();}
	@Override
	public String ötvözetGetID(){return "SzereloTesztRobot ID" + robot.getID();}
	@Override
	public int ötvözetGetMemoria(){return   robot.getMemoria()/16384;}
	@Override
	public String ötvözetGetNem(){return "SzereloTesztRobot Neme" + robot.getNem();}
	@Override
	public int ötvözetGetTeljesitmeny(){return   robot.getTeljesitmeny();}
	@Override
	public String ötvözetGetElv(){return "SzereloTesztRobot Elve: " + robot.getElv();}
	public void work();
	public void sleep();
    	 public String[] getSzoftvers(){
		 return Szoftver;
    }	
}
