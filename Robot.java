package robot1;

/**
 *
 * @author Dani
 */
public class Robot1{

    
   public static void main(String[] args)  {
                Robot r1 = new GyáriRobot("ID:123",5096,"Férfi",120,"Elv1, Elv2, Elv3");
		System.out.println(r1);
		Robot r2 = new SzereloRobot("ID:456",5096,"Férfi",220,"Elv1, Elv2, Elv3");
		System.out.println(r2);
		Robot r3 = new RendörRobot("ID:789",5096,"Férfi",320,"Elv1, Elv2, Elv3");
		System.out.println(r3);
		Robot r4 = new HáziRobot("ID:112",5096,"Nő",60,"Elv1, Elv2, Elv3");
		System.out.println(r4);
		Robot r5 = new IrodaiRobot("ID:113",5096,"Nő",50,"Elv1, Elv2, Elv3");
		System.out.println(r5);
	       
    }
    
}

interface Ember{
	String getNev();
	String getNem();
	int getIQ();
	
}
interface ISzoftvers{
	String[] getstoftvers = new String[]{"KUKA", "Windows", "Linux"};
}
interface IWorkable{
	void getwork();
}
interface ISleepable{
	void getsleep();
}
interface IWorker extends IWorkable, ISleepable{
	
}


 abstract class Robot implements ISzoftvers, IWorker {
	String ID;
	int memoria;
	String nem;
	
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
        String Szoftver;
	
	 public String[] getSzoftvers(String Szoftver){
		 return null;
	 }
	 
    String kiir() {
	    return kiir();
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

abstract class Textúra extends Robot implements ISzoftvers, IWorker{

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
	public String[] getSzoftvers(String Szoftver){
		 return getSzoftvers();
	 }	

    private String[] getSzoftvers() {
        return null;
    }
}
 class GyáriRobot extends Textúra implements ISzoftvers, IWorker{
    Robot gyariRobot;
    String Szoftver;

    public GyáriRobot(String ID, int memoria, String nem, int teljesitmeny, String elv) {
        super(ID, memoria, nem, teljesitmeny, elv);
    }
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
	 
   
    public String[] getSzoftvers(String Szoftver){
	 return getSzoftvers();
    }  

    @Override
    public String kiir() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public Robot gyariRobot() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public void getwork() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public void getsleep() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    private String[] getSzoftvers() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
}

 

   


class RendörRobot extends Textúra implements ISzoftvers, IWorker{
    Robot rendorRobot;
    String Szoftver;

    public RendörRobot(String ID, int memoria, String nem, int teljesitmeny, String elv) {
        super(ID, memoria, nem, teljesitmeny, elv);
    }
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
    public String[] getSzoftvers(String Szoftver){
        return getSzoftvers();
    }

    @Override
    public String kiir() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public void getwork() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public void getsleep() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    private String[] getSzoftvers() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public Robot gyariRobot() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
}

class HáziRobot extends Textúra implements ISzoftvers, IWorker{
    Robot haziRobot;
    String Szoftver;

    public HáziRobot(String ID, int memoria, String nem, int teljesitmeny, String elv) {
        super(ID, memoria, nem, teljesitmeny, elv);
    }
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
    public String[] getSzoftvers(String Szoftver){
        return getSzoftvers();
    }   

    @Override
    public String kiir() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public Robot gyariRobot() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public void getwork() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public void getsleep() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    private String[] getSzoftvers() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
}


class IrodaiRobot extends Textúra implements ISzoftvers, IWorker{
    Robot irodaiRobot;
    String Szoftver;

    public IrodaiRobot(String ID, int memoria, String nem, int teljesitmeny, String elv) {
        super(ID, memoria, nem, teljesitmeny, elv);
    }
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
    public String[] getSzoftvers(String Szoftver){
        return getSzoftvers();
    } 

    @Override
    public String kiir() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public Robot gyariRobot() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public void getwork() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public void getsleep() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    private String[] getSzoftvers() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
}

class SzereloRobot extends Textúra implements ISzoftvers, IWorker{
    Robot szereloRobot;
    String Szoftver;

    public SzereloRobot(String ID, int memoria, String nem, int teljesitmeny, String elv) {
        super(ID, memoria, nem, teljesitmeny, elv);
    }
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
    public String[] getSzoftvers(){
	return getSzoftvers();
    } 

    @Override
    public String kiir() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public Robot gyariRobot() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public void getwork() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public void getsleep() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
}

  abstract class Ötvözet extends Textúra implements ISzoftvers, IWorker{
	protected Robot robot;
	
	public Ötvözet(String ID, int memoria, String nem, int teljesitmeny, String elv) {
        super(ID, memoria, nem, teljesitmeny, elv);	
    }     

    
}

abstract class GyáriTesztRobot extends Ötvözet implements ISzoftvers, IWorker{

    public GyáriTesztRobot(String ID, int memoria, String nem, int teljesitmeny, String elv) {
        super(ID, memoria, nem, teljesitmeny, elv);
    }
	Robot GyáriTesztRobot(Robot robot){this.robot = robot;return null;
}
	String Szofver;
	
	public String ötvözetKiir(){return "GyáriTesztRobot" + robot.kiir();}
	
	public String ötvözetGetID(){return "GyáriTesztRobot ID" + robot.getID();}
	
	public int ötvözetGetMemoria(){return  robot.getMemoria()/32768;}
	
	public String ötvözetGetNem(){return "GyáriTesztRobot Neme" + robot.getNem();}
	
	public int ötvözetGetTeljesitmeny(){return  robot.getTeljesitmeny();}
	
	public String ötvözetGetElv(){return "GyáriTesztRobot Elve: " + robot.getElv();}
   	public String[] getSzoftvers(String szoftver){
	 	return getSzoftvers();
    }

    private String[] getSzoftvers() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
}
	
abstract class RendörTesztRobot extends Ötvözet implements ISzoftvers, IWorker{

    public RendörTesztRobot(String ID, int memoria, String nem, int teljesitmeny, String elv) {
        super(ID, memoria, nem, teljesitmeny, elv);
    }
    
	Robot RendörTesztRobot(Robot robot){this.robot = robot;return null;
}
	String Szoftver;
	
	public String ötvözetKiir(){return "RendörTesztRobot" + robot.kiir();}
	
	public String ötvözetGetID(){return "RendörTesztRobot ID" + robot.getID();}
	
	public int ötvözetGetMemoria(){return  + robot.getMemoria()/16348;}
	
	public String ötvözetGetNem(){return "RendörTesztRobot Neme" + robot.getNem();}
	
	public int ötvözetGetTeljesitmeny(){return  robot.getTeljesitmeny();}
	
	public String ötvözetGetElv(){return "RendörTesztRobot Elve: " + robot.getElv();}
    	public String[] getSzoftvers(String szoftver){
	 	return getSzoftvers();
    }	

    private String[] getSzoftvers() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
}
	
abstract class HáziTesztRobot extends Ötvözet implements ISzoftvers, IWorker{

    public HáziTesztRobot(String ID, int memoria, String nem, int teljesitmeny, String elv) {
        super(ID, memoria, nem, teljesitmeny, elv);
    }
	Robot HáziTesztRobot(Robot robot){this.robot = robot;return null;
}
	String Szoftver;
	
	public String ötvözetKiir(){return "HáziTesztRobot" + robot.kiir();}
	
	public String ötvözetGetID(){return "HáziTesztRobot ID" + robot.getID();}
	
	public int ötvözetGetMemoria(){return   robot.getMemoria()/4096;}
	
	public String ötvözetGetNem(){return "HáziTesztRobot Neme" + robot.getNem();}
	
	public int ötvözetGetTeljesitmeny(){return  robot.getTeljesitmeny();}
	
	public String ötvözetGetElv(){return "HáziTesztRobot Elve: " + robot.getElv();}
    	public String[] getSzoftvers(String szoftver){
	 	return getSzoftvers();
    }	

    private String[] getSzoftvers() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
}
	
abstract class IrodaiTesztRobot extends Ötvözet implements ISzoftvers, IWorker{

    public IrodaiTesztRobot(String ID, int memoria, String nem, int teljesitmeny, String elv) {
        super(ID, memoria, nem, teljesitmeny, elv);
    }
	Robot IrodaiTesztRobot(Robot robot){this.robot =robot;return null;
}
	String Szoftver;
	
	public String ötvözetKiir(){return "IrodaiTesztRobot" + robot.kiir();}
	
	public String ötvözetGetID(){return "IrodaiTesztRobot ID" + robot.getID();}
	
	public int ötvözetGetMemoria(){return  robot.getMemoria()/65536;}
	
	public String ötvözetGetNem(){return "IrodaiTesztRobot Neme" + robot.getNem();}
	
	public int ötvözetGetTeljesitmeny(){return   robot.getTeljesitmeny();}
	
	public String ötvözetGetElv(){return "IrodaiTesztRobot Elve: " + robot.getElv();}
   		public String[] getSzoftvers(String szoftver){
	 	return getSzoftvers();
    }

    private String[] getSzoftvers() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
}
	
abstract class SzereloTesztRobot extends Ötvözet implements ISzoftvers, IWorker{

    public SzereloTesztRobot(String ID, int memoria, String nem, int teljesitmeny, String elv) {
        super(ID, memoria, nem, teljesitmeny, elv);
    }
	Robot  SzereloTesztRobot(Robot robot){this.robot = robot;return null;
}
	String Szoftver;
	
	public String ötvözetKiir(){return "SzereloTesztRobot" + robot.kiir();}
	
	public String ötvözetGetID(){return "SzereloTesztRobot ID" + robot.getID();}
	
	public int ötvözetGetMemoria(){return   robot.getMemoria()/16384;}
	
	public String ötvözetGetNem(){return "SzereloTesztRobot Neme" + robot.getNem();}
	
	public int ötvözetGetTeljesitmeny(){return   robot.getTeljesitmeny();}
	
	public String ötvözetGetElv(){return "SzereloTesztRobot Elve: " + robot.getElv();}
    	public String[] getSzoftvers(String szoftver){
	 	return getSzoftvers();
    }	

    private String[] getSzoftvers() {
        return getSzoftvers(); 
    }
}
