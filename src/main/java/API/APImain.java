package API;

import java.util.Arrays;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestTemplate;

public class APImain {

	public static void main(String args[]) {
		// Scanner in = new Scanner(System.in);
		RestTemplate restTemplate = new RestTemplate();
		Json[] J;
		/*try {
			HttpHeaders headers = new HttpHeaders();
			headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
			headers.add("user-agent",
					"Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/54.0.2840.99 Safari/537.36");
			HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);
			J = restTemplate.exchange("http://api.mathjs.org/v4/?expr=sqrt(4)", HttpMethod.GET, entity, Jason.class)
					.getBody();

			System.out.println(J.getResult());
		} catch (Exception ex) {
			ex.printStackTrace();
		}*/

		J = restTemplate.getForObject("https://restcountries.eu/rest/v2/name/eesti" ,Json[].class);

		System.out.println(J[0].getName());

	}
}

/*
[{
   // "name": "Colombia",
    "topLevelDomain": [".co"],
    "alpha2Code": "CO",
    "alpha3Code": "COL",
    "callingCodes": ["57"],
 //   "capital": "Bogotá",
  //  "altSpellings": ["CO", "Republic of Colombia", "República de Colombia"],
  //  "region": "Americas",
  //  "subregion": "South America",
  //  "population": 48759958,
    "latlng": [4.0, -72.0],
 //   "demonym": "Colombian",
 //   "area": 1141748.0,
    "gini": 55.9,
 //   "timezones": ["UTC-05:00"],
 //   "borders": ["BRA", "ECU", "PAN", "PER", "VEN"],
 //   "nativeName": "Colombia",
 //   "numericCode": "170",
 //   "currencies": [{
        "code": "COP",
        "name": "Colombian peso",
        "symbol": "$"
    }],
    
 //   "languages": [{
        "iso639_1": "es",
        "iso639_2": "spa",
        "name": "Spanish",
        "nativeName": "Español"
    }],
    "translations": {
        "de": "Kolumbien",
        "es": "Colombia",
        "fr": "Colombie",
        "ja": "コロンビア",
        "it": "Colombia",
        "br": "Colômbia",
        "pt": "Colômbia"
    },
    "flag": "https://restcountries.eu/data/col.svg",
    "regionalBlocs": [{
        "acronym": "PA",
        "name": "Pacific Alliance",
        "otherAcronyms": [],
        "otherNames": ["Alianza del Pacífico"]
    }, {
        "acronym": "USAN",
        "name": "Union of South American Nations",
        "otherAcronyms": ["UNASUR", "UNASUL", "UZAN"],
        "otherNames": ["Unión de Naciones Suramericanas", "União de Nações Sul-Americanas", "Unie van Zuid-Amerikaanse Naties", "South American Union"]
    }],
    "cioc": "COL"
}]
*/
