package springii;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Controlw {

	DAOInterface dc;

	@Autowired
	public Controlw(DAOInterface dc) {
		this.dc = dc;
	}

	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String home() {
		return "crud";
	}

	@RequestMapping(value = "/first", method = RequestMethod.GET)
	@ResponseBody
	public ModelClass first() {

		ModelClass al = dc.first();
		return al;
	}

	@RequestMapping(value = "/last", method = RequestMethod.GET)
	@ResponseBody
	public ModelClass last() {

		ModelClass al = dc.last();
		return al;
	}

	@RequestMapping(value = "/start", method = RequestMethod.GET)
	@ResponseBody
	public List<ModelClass> start() {

		List<ModelClass> al = dc.start();
		return al;
	}

	@RequestMapping(value = "/edit", method = RequestMethod.GET)
    @ResponseBody
	public void edit(ModelClass m) {
		

		dc.edit(m);

	}

	@RequestMapping(value = "/add", method = RequestMethod.GET)
	 @ResponseBody
	public void add(ModelClass m) {
dc.add(m);

	}

	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	 @ResponseBody
	public void del(ModelClass m) {
		dc.del(m);

	}
}
