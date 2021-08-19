package quanly;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ManageCB {
	private List<CanBo> cb;
	
	public ManageCB() {
		this.cb = new ArrayList<CanBo>();
	}
	
	public void addCanBo(CanBo canbo) {
        this.cb.add(canbo);
    }

    public List<CanBo> searchName(String name) {
        return this.cb.stream().filter(o -> o.getName().contains(name)).collect(Collectors.toList());
    }

    public void displayInfor() {
        this.cb.forEach(o -> o.display());
    }

}
