package day21;

public class UniversalRemote {

	public static void main(String[] args) {
		System.out.println("Demo Remote............");
		
		Tv tv=new Tv();
		SetTopBox setTopBox=new SetTopBox();
		NetFlix netFlix=new NetFlix();
		SoundSystem soundSystem=new SoundSystem();
		
		FatherNewsChannelCommand fncc=new FatherNewsChannelCommand(tv, setTopBox, soundSystem, netFlix);
		MotherSerialCommand msc=new MotherSerialCommand(tv, setTopBox, soundSystem, netFlix);
		MotherOldMovieCommand momc=new MotherOldMovieCommand(tv, setTopBox, soundSystem, netFlix);
		
		Remote universalRemote=new Remote();		
		universalRemote.setCommand(fncc, 0);
		universalRemote.setCommand(momc, 1);
		universalRemote.setCommand(msc, 2);
		
		
		universalRemote.executeCommand(1);
	}

}

class Tv{
	public void av1() {
		System.out.println("Tv Switched to av1 mode...");
	}
	public void switchOn() {
		System.out.println("tv switched on..........");
	}
}

class SetTopBox{
	public void newsChannel() {
		System.out.println("news channel statted......");
	}
	public void serailChannel() {
		System.out.println("Serial Channel Started.");
	}
}

class NetFlix{
	public void movieOld() {
		System.out.println("old movice started");
	}
}

class SoundSystem{
	public void lowSound() {
		System.out.println("Sound volume....decreaded");
	}
}

interface Command{
	public void execute();
}

class FatherNewsChannelCommand implements Command{
	Tv tv; SetTopBox setTopBox; SoundSystem soundSystem; NetFlix netFlix;
	public FatherNewsChannelCommand(Tv tv, SetTopBox setTopBox, SoundSystem soundSystem, NetFlix netFlix) {
		this.tv=tv;
		this.setTopBox = setTopBox;
		this.netFlix = netFlix;
		this.soundSystem = soundSystem;
	}
	
	@Override
	public void execute() {
		System.out.println("Father Tv action started........");
		tv.switchOn();
		tv.av1();
		setTopBox.newsChannel();
		soundSystem.lowSound();
		System.out.println("Dad Enjoy your news channel.....");
		
	}
}

class MotherOldMovieCommand implements Command{
	Tv tv; SetTopBox setTopBox; SoundSystem soundSystem; NetFlix netFlix;
	public MotherOldMovieCommand(Tv tv, SetTopBox setTopBox, SoundSystem soundSystem, NetFlix netFlix) {
		this.tv=tv;
		this.setTopBox = setTopBox;
		this.netFlix = netFlix;
		this.soundSystem = soundSystem;
		
	}
	
	@Override
	public void execute() {
		System.out.println("Mother Old movie started........");
		tv.switchOn();
		tv.av1();
		netFlix.movieOld();
		soundSystem.lowSound();
		System.out.println("Mom Enjoy your Old movies....");
		
	}
}

class MotherSerialCommand implements Command{
	Tv tv; SetTopBox setTopBox; SoundSystem soundSystem; NetFlix netFlix;
	public MotherSerialCommand(Tv tv, SetTopBox setTopBox, SoundSystem soundSystem, NetFlix netFlix) {
		this.tv=tv;
		this.setTopBox = setTopBox;
		this.netFlix = netFlix;
		this.soundSystem = soundSystem;
	}
	
	@Override
	public void execute() {
		System.out.println("Mother Serial started........");
		tv.switchOn();
		tv.av1();
		setTopBox.serailChannel();
		soundSystem.lowSound();
		System.out.println("Mom Enjoy your Serial....");
		
	}
}

class DummyCommand implements Command{
	@Override
	public void execute() {
		System.out.println("Dummy");
		
	}
}

class Remote{
	Command command[] = new Command[5];
	public Remote() {
		for(int i=0;i<command.length;i++) {
			command[i]=new DummyCommand();
		}		
	}
	public void setCommand(Command command, int slot) {
		this.command[slot]=command;
	}
	public void executeCommand(int slot) {
		command[slot].execute();
	}
}