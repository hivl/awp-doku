package org.springframework.rest;

import java.util.HashMap;
import java.util.Map;

import org.hska.gae.domain.Adresse;
import org.hska.gae.domain.Kunde;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Handles requests for the application home page.
 */
@Controller
public class KundeStaticController {

	private static final Map<Integer, Kunde> kunden = new HashMap<Integer, Kunde>();

	static {
			
		kunden.put(1,
			new Kunde(
					1,
					"Horst",
					"Mueller",
					new Adresse(11,"Nebenstr.","1a","Karlsruhe",72127)
			)
		);
			
		kunden.put(2,
			new Kunde(
					2,
					"Dieter",
					"Maier",
					new Adresse(12,"Hauptstr.","1a","Stuttgart",12345)
			)						
		);
				
	}

	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/kunden/{kundeId}", method = RequestMethod.GET)
	@ResponseBody
	public Kunde findCharacter(@PathVariable int kundeId) {
		return kunden.get(kundeId);

	}

}
