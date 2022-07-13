public interface ParkingService {
	

	int park(String registration_number,int age);

	void printTicket(String registration_number,int allocated_slot);

	void getSlotNumbersByAge(int age);

	void getSlotByRegNum(String registration_number);

	void getRegNumbersByAge(int age);

  Car getCarBySlot(int slot);

  void leave(int allocated_slot);
}