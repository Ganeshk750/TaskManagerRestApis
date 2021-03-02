package com.ganesh.apis.db_data;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

import javax.persistence.Convert;

import com.ganesh.apis.model.Country;
import com.ganesh.apis.repository.CountryRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.ganesh.apis.model.ClientLocation;
import com.ganesh.apis.model.Project;
import com.ganesh.apis.repository.ClientLocationRepository;
import com.ganesh.apis.repository.ProjectRepository;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class DBOperationRunner implements CommandLineRunner {
	
	private final ClientLocationRepository clientLocation;
	private final ProjectRepository projectRepository;
	private final CountryRepository countryRepository;

	@Override
	public void run(String... args) throws Exception {
		
		clientLocation.saveAll(Arrays.asList(
				   new ClientLocation(1, "Boston"),
				   new ClientLocation(2, "New Delhi"),
				   new ClientLocation(3, "New Jersy"),
				   new ClientLocation(4, "New York"),
				   new ClientLocation(5, "London"),
				   new ClientLocation(6, "Tokyo")   
				));
		System.out.println("----------All Client Location Data saved into Database--------------");
		
		
		DateFormat df = new SimpleDateFormat("MM-dd-yyyy");
		Date d1 = df.parse("12-10-2020");
		Date d2 = df.parse("12-8-2020");

		projectRepository.saveAll(Arrays.asList(
				new Project(1, "Hospital Managment System", d1, 14, "In Forece", true, 2),
				new Project(2, "Hospital Managment System", d2, 84, "Support", true, 1)
		));
		System.out.println("----------All Project Data saved into Database--------------");

		countryRepository.saveAll(Arrays.asList(
				new Country(1, "China"),
				new Country(2 ,"United States"),
				new Country(3,"Indonesia"),
				new Country(4, "Brazil"),
				new Country(5, "Pakistan"),
				new Country( 7, "Bangladesh" ),
				new Country( 8, "Russia" ),
				new Country( 6, "Nigeria" ),
				new Country( 9, "Japan" ),
				new Country( 10,  "Mexico" ),
				new Country( 11,  "Philippines" ),
				new Country( 12,  "Vietnam" ),
				new Country( 13,  "Ethiopia" ),
				new Country( 14,  "Egypt" ),
				new Country( 15,  "Germany" ),
				new Country( 16,  "Iran" ),
				new Country( 17,  "Turkey" ),
				new Country( 18,  "Democratic Republic of the Congo" ),
				new Country( 19,  "Thailand" ),
				new Country( 20,  "France" ),
				new Country( 21,  "United Kingdom"),
				new Country( 22,  "Italy"),
				new Country( 23,  "South Africa" ),
				new Country( 24,  "South Korea" ),
				new Country( 25,  "Myanmar" ),
				new Country( 26,  "Spain" ),
				new Country( 27,  "Colombia" ),
				new Country( 28,  "Ukraine" ),
				new Country( 29,  "Tanzania" ),
				new Country( 30,  "Argentina"),
				new Country( 31,  "Kenya" ),
				new Country( 32,  "Poland" ),
				new Country( 33,  "Algeria" ),
				new Country( 34,  "Canada" ),
				new Country( 35,  "Uganda" ),
				new Country( 36,  "Iraq" ),
				new Country( 37,  "Morocco" ),
				new Country( 38,  "Sudan" ),
				new Country( 39,  "Peru" ),
				new Country( 40,  "Malaysia" ),
				new Country( 41,  "Uzbekistan"),
				new Country( 42,  "Saudi Arabia"),
				new Country( 43,  "Venezuela"),
				new Country( 44,  "Nepal"),
				new Country( 45,  "Afghanistan"),
				new Country( 46,  "Ghana" ),
				new Country( 47,  "Yemen" ),
				new Country( 48,  "North Korea"),
				new Country( 49,  "Mozambique"),
				new Country( 50,  "Taiwan" ),
				new Country( 51,  "Australia" ),
				new Country( 52,  "Syria" ),
				new Country( 53,  "Ivory Coast"),
				new Country( 54,  "Madagascar"),
				new Country( 55,  "Angola"),
				new Country(56, "Sri Lanka"),
				new Country(57, "Cameroon"),
				new Country(58, "Romania"),
				new Country(59, "Kazakhstan"),
				new Country(60, "Netherlands"),
				new Country(61, "Chile"),
				new Country(62, "Niger"),
				new Country(63, "Burkina Faso"),
				new Country(64, "Ecuador"),
				new Country(65, "Guatemala"),
				new Country(66, "Mali"),
				new Country(67, "Malawi"),
				new Country(68, "Senegal"),
				new Country(69, "Cambodia"),
				new Country(70, "Zambia"),
				new Country(71, "Zimbabwe"),
				new Country(72, "Chad"),
				new Country(73, "Cuba"),
				new Country(74, "Belgium"),
				new Country(75, "Guinea" ),
				new Country(76, "Greece"),
				new Country(77, "Tunisia"),
				new Country(78, "Portugal"),
				new Country(79, "Rwanda"),
				new Country(80, "Czech Republic"),
				new Country(81, "Haiti"),
				new Country(82, "Bolivia"),
				new Country(83, "Somalia"),
				new Country(84, "Hungary" ),
				new Country(85, "Benin"),
				new Country(86, "Sweden"),
				new Country(87, "Belarus"),
				new Country( 88, "Dominican Republic"),
				new Country( 89, "Azerbaijan"),
				new Country( 90, "Austria"),
				new Country( 91, "Honduras"),
				new Country( 92, "United Arab Emirates"),
				new Country( 93, "South Sudan"),
				new Country( 94, "Burundi"),
				new Country( 95, "Switzerland"),
				new Country( 96, "Israel"),
				new Country( 97, "Tajikistan"),
				new Country( 98, "Bulgaria"),
				new Country( 99, "Serbia"),
				new Country( 100, "Papua New Guinea"),
				new Country( 101, "Paraguay"),
				new Country( 102, "Laos"),
				new Country( 103, "Libya"),
				new Country( 104, "Jordan" ),
				new Country( 105, "Sierra Leone"),
				new Country( 106, "Togo" ),
				new Country( 107, "El Salvador" ),
				new Country( 108, "Nicaragua" ),
				new Country( 109, "Eritrea" ),
				new Country( 110, "Denmark" ),
				new Country( 111, "Kyrgyzstan" ),
				new Country( 112, "Slovakia" ),
				new Country( 113, "Finland" ),
				new Country( 114, "Singapore" ),
				new Country( 115, "Turkmenistan" ),
				new Country( 116, "Norway" ),
				new Country( 117, "Costa Rica" ),
				new Country( 118, "Central African Republic" ),
				new Country( 119, "Ireland" ),
				new Country( 120, "Georgia" ),
				new Country( 121, "New Zealand" ),
				new Country( 122, "Republic of the Congo"),
				new Country( 123, "Lebanon"),
				new Country( 124, "Palestine"),
				new Country( 125, "Croatia"),
				new Country( 126, "Bosnia and Herzegovina"),
				new Country( 127, "Kuwait"),
				new Country( 128, "Moldova"),
				new Country( 129, "Liberia"),
				new Country( 130, "Mauritania"),
				new Country( 131, "Panama"),
				new Country( 132, "Uruguay"),
				new Country( 133, "Armenia"),
				new Country( 134, "Lithuania"),
				new Country( 135, "Albania"),
				new Country( 136, "Oman"),
				new Country( 137, "Mongolia"),
				new Country( 138, "Jamaica"),
				new Country( 139, "Lesotho"),
				new Country( 140, "Namibia"),
				new Country( 141, "Macedonia"),
				new Country( 142, "Slovenia"),
				new Country( 143, "Latvia"),
				new Country( 144, "Botswana"),
				new Country( 145, "Qatar"),
				new Country( 146, "Gambia"),
				new Country( 147, "Gabon"),
				new Country( 148, "Guinea-Bissau"),
				new Country( 149, "Trinidad and Tobago"),
				new Country( 150, "Estonia"),
				new Country( 151, "Mauritius"),
				new Country( 152, "Swaziland"),
				new Country( 153, "Bahrain"),
				new Country( 154, "Timor-Leste"),
				new Country( 155, "Cyprus"),
				new Country( 156, "Fiji"),
				new Country( 157, "Djibouti"),
				new Country( 158, "Guyana"),
				new Country( 159, "Equatorial Guinea"),
				new Country( 160, "Bhutan"),
				new Country( 161, "Comoros"),
				new Country( 162, "Montenegro"),
				new Country( 163, "Western Sahara"),
				new Country( 164, "Suriname"),
				new Country( 165, "Luxembourg"),
				new Country( 166, "Solomon Islands"),
				new Country( 167, "Cape Verde"),
				new Country( 168, "Malta"),
				new Country( 169, "Brunei"),
				new Country( 170, "Bahamas"),
				new Country( 171, "Maldives"),
				new Country( 172, "Iceland" ),
				new Country( 173, "Belize"),
				new Country( 174, "Barbados"),
				new Country( 175, "Vanuatu"),
				new Country( 176, "Samoa"),
				new Country(177, "Saint Lucia"),
				new Country(178, "Kiribati" ),
				new Country(179, "Grenada" ),
				new Country(180, "Tonga"),
				new Country(181, "Federated States of Micronesia"),
				new Country(182, "Saint Vincent and the Grenadines"),
				new Country(183, "Seychelles"),
				new Country(184, "Antigua and Barbuda"),
				new Country(185, "Andorra"),
				new Country(186, "Dominica"),
				new Country(187, "Liechtenstein"),
				new Country(188, "Monaco"),
				new Country(189, "San Marino"),
				new Country(190, "Palau"),
				new Country(191, "Tuvalu"),
				new Country(192, "Nauru"),
				new Country(193, "Vatican City")
		));
		System.out.println("----------All Country Location Data saved into Database--------------");
	}


}
