package robot1;

/**
 *
 * @author Dani
 */
public class Robot1{

    
    public static void main(String[] args)  {
                Robot r1 = new GyáriRobot();
		System.out.println(r1.getElv());
		Robot r2 = new SzereloRobot();
		System.out.println();
		Robot r3 = new RendörRobot();
		System.out.println();
		Robot r4 = new HáziRobot();
		System.out.println();
		Robot r5 = new IrodaiRobot();
		System.out.println();
    }
    
}

interface Ember{
	String getNev();
	String getNem();
	int getIQ();
	
}


 abstract class Robot{
	String ID;
	int memoria;
	String nem;
	
	int teljesitmeny;
	String elv;
	String szoftver;
	public Robot(String ID, int memoria, String nem, int teljesitmeny, String elv, String szoftver){
		this.ID = ID;
		this.memoria = memoria;
		this.nem = nem;
		this.teljesitmeny=teljesitmeny;
		this.elv = elv;
		this.szoftver = szoftver;
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
		String elv1 = "";
		String elv2 = "";
		String elv3 = "";
		if(elv1 == elv2 && elv1 == elv3 && elv2 == elv3){
			return "Az elvek megfelelnek";
		}
		else return "Nem megfelelőek az elvek";
			
	}
	public String getSzoftver(){return szoftver;}

    String kiir() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
	
	



abstract class Textúra extends Robot{

    public Textúra(String ID, int memoria, String nem, int teljesitmeny, String elv, String szoftver) {
        super(ID, memoria, nem, teljesitmeny, elv, szoftver);
    }
	public abstract String kiir();
	public abstract String getID();
	public abstract int getMemoria();
	public abstract String getNem();
	public abstract int getTeljesitmeny();
	public abstract String getElv();
	public abstract String getSzoftver();
        public abstract Robot gyariRobot();
        
	
}
 class GyáriRobot extends Textúra{
    Robot gyariRobot;
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

    @Override
    public String getSzoftver() {
        return "Szoftver:" + gyariRobot.getSzoftver();
    }
}

class RendörRobot extends Textúra{
    Robot rendorRobot;	
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

    @Override
    public String getSzoftver() {
        return "RendörTesztRobot Szoftvere: " + rendorRobot.getSzoftver();
    }
}

class HáziRobot extends Textúra{
    Robot haziRobot;
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

    @Override
    public String getSzoftver() {
        return "RendörTesztRobot Szoftvere: " + haziRobot.getSzoftver();
    }
}


class IrodaiRobot extends Textúra{
    Robot irodaiRobot;
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

    @Override
    public String getSzoftver() {
        return "RendörTesztRobot Szoftvere: " + irodaiRobot.getSzoftver();
    }
}

class SzereloRobot extends Textúra{
    public Robot szereloRobot;
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

    @Override
    public String getSzoftver() {
        return "RendörTesztRobot Szoftvere: " + szereloRobot.getSzoftver();
    }
}
abstract class Ötvözet extends Textúra{
	protected Robot robot;
	public Ötvözet(String ID, int memoria, String nem, int teljesitmeny, String elv, String szoftver) {
        super(ID, memoria, nem, teljesitmeny, elv, szoftver);
        
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
	public String getSzoftver(){
		return ötvözetGetSzoftver() + robot.getSzoftver();
	}
	public abstract String ötvözetKiir();
	public abstract String ötvözetGetID();
	public abstract int ötvözetGetMemoria();
	public abstract String ötvözetGetNem();
	public abstract int ötvözetGetTeljesitmeny();
	public abstract String ötvözetGetElv();
	public abstract String ötvözetGetSzoftver();
        
}

abstract class GyáriTesztRobot extends Ötvözet{
	public GyáriTesztRobot(Robot robot){this.robot = robot;}
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
	@Override
	public String ötvözetGetSzoftver(){return "GyáriTesztRobot Szoftvere: " + robot.getSzoftver();}
}
abstract class RendörTesztRobot extends Ötvözet{
    
	public RendörTesztRobot(Robot robot){this.robot = robot;}
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
	@Override
	public String ötvözetGetSzoftver(){return "RendörTesztRobot Szoftvere: " + robot.getSzoftver();}
}
abstract class HáziTesztRobot extends Ötvözet{
	public HáziTesztRobot(Robot robot){this.robot = robot;}
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
	@Override
	public String ötvözetGetSzoftver(){return "HáziTesztRobot Szoftvere: " + robot.getSzoftver();}
}
abstract class IrodaiTesztRobot extends Ötvözet{
	public IrodaiTesztRobot(Robot robot){this.robot =robot;}
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
	@Override
	public String ötvözetGetSzoftver(){return "IrodaiTesztRobot Szoftvere: " + robot.getSzoftver();}
}
abstract class SzereloTesztRobot extends Ötvözet{
	public  SzereloTesztRobot(Robot robot){this.robot = robot;}
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
	@Override
	public String ötvözetGetSzoftver(){return "SzereloTesztRobot Szoftvere: " + robot.getSzoftver();}
}
