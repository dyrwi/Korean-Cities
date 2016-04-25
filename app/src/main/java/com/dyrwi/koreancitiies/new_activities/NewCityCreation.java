package com.dyrwi.koreancitiies.new_activities;

import com.dyrwi.koreancitiies.R;
import com.dyrwi.koreancitiies.classes.City;

import java.util.ArrayList;

/**
 * Created by Ben on 10-Sep-15.
 */
public class NewCityCreation {

    public static ArrayList<NewCity> generate() {
        ArrayList<NewCity> cities = new ArrayList<NewCity>();
        NewCity seoul = new NewCity();
        seoul.setName("Seoul");
        seoul.setPopulation(25620000);
        seoul.setHistory("It is believed that humans were living in the area that is now Seoul along the lower reaches of the Han River during the Paleolithic Age and " +
                "archaeological research shows that people began to lead settled lives starting in the Neolithic Age. " +
                "Prehistoric remains that are unearthed in the Amsa Prehistoric Site (Amsa Seonsa Yujeokji), " +
                "located in Amsa-dong, Gangdong-gu, date back to about 3,000 to 7,000 years ago. \n\nWith the introduction " +
                "of bronze ware from about 700 BC, settlements gradually began to spread from the river basin toward inland areas.");
        seoul.setBriefDescription("Seoul has been the capital of Korea for about 600 years, since the time of the Joseon Dynasty(1392-1910). " +
                "Seoul was referred to as “Han Yang” during the Joseon Dynasty, but after the liberation from Japan, in 1945, the newly " +
                "founded Republic of Korea officially changed its capital city’s name to Seoul. \n\nSeoul has developed into a bustling metropolis, " +
                "acting as the hub for political, economic, social, and cultural matters. The Han River runs through the heart of the city. " +
                "The river divides the city in two; the northern part of the city is a focal point for culture and history, while the southern " +
                "part is well known for its business district. \n\nSeoul has hosted many international events including: 1986 Asian Games, 1988 " +
                "Olympic Games and 2002 Korea/Japan FIFA World Cup. The success of these events has shown people that Korea is truly an international city.");
        seoul.setTouristAttractions("In Seoul you can find ancient palaces and Royal Shrines of the Joseon Dynasty, as well as Seoul World Cup Stadium, 63 CITY building, " +
                "Lotte World, Han River, Namsan, Bukhansan Mountain National Park, Daehangno, Insa-dong, Itaewon, Myeong-dong, Apgujeong, Namdaemun and Dongdaemun Markets." +
                "\n\nOn the outskirts of Seoul you can find Seoul Land, Everland, Caribbean Bay, The Korean Folk Village, Suwon Hwaseong Fortress, and Namhansan Mountain Fortress. ");
        seoul.setPhoto(R.drawable.seoul_icon);
        cities.add(seoul);

        NewCity busan = new NewCity();
        busan.setName("Busan");
        busan.setPopulation(3525913);
        busan.setHistory("Busan is geographically located in the south-east corner of the Korean Peninsula, and this might " +
                "explain the late arrival of the Bronze Age there. The ruins and remains of the Bronze Age are being discovered," +
                " in places such as Guseo-dong, Geumgang Park, Geumsa-dong, Sajik-dong, Bugok-dong, Goijeong-dong, and Nopo-dong.\n" +
                "The ruins being discovered are more numerous and significant when compared with the ruins of the Neolithic Age. " +
                "Of particular note is the inland location of the ruins on hilly regions some distance from the sea.\n" +
                "\n" +
                "Bronze Age communities in Busan used no patterned earthenware.\n" +
                "The Bronze Age had a great effect on the ensuing development of the Japanese Yayoi Culture.\n" +
                "Most ruins and remains from the Iron Age(throughout the Three Hans period, Gaya and the beginning of the Three Kingdoms) are shell mounds and old tombs.\n" +
                "\n" +
                "Shell mounds and old tombs are found range throughout Jodo, Yeongseon-dong, Dadae-dong, Goejeong-dong, Dongnae Nakmin-dong, " +
                "Oryundae, Hwamyeong-dong, Geumsa-dong, and Bokcheon-dong.\n" +
                "\n" +
                "There are many more old tombs of the Busan region dating from the Iron Age compared to other regions. Since the place for " +
                "refining iron was discovered in Dongnae shell-mounds, excavations have shown that Busan was the central production area for Iron. " +
                "It is also apparent that refined iron from here was exported to Japan, Naglang ,Dabang and other regions by means of the Suyeong River. " +
                "These facts are recorded in the \"Wui History\" chapter of the \"History of the Three Kingdoms of China\".");
        busan.setBriefDescription("Situated on the most south-eastern portion of the Korean peninsula, Busan is Korea's second largest city and the number 1 trading port. " +
                "Korea's first truly international city, Busan (Pusan) connects Asia, Europe, and North America. This geopolitically situated harbor city sits adjacent to the " +
                "Korean Straits and Japan, bringing about an interchange of trade and tourism. \n\nThis intercultural current has made Busan into the international metropolis it " +
                "is today. Busan has hosted such international events as the 2002 14th Asian Games, the final match of the Korea/Japan World Cup, and since 1995 has annually " +
                "hosted the Pusan International Film Festival. \n\nAdditionally, the Bexco Exhibition and Convention Center in Busan brings in people from all over the world for " +
                "international conventions and exhibits. Shopping in this port city has also become quite popular. Lotte Department Store, Choryang Arcade for Foreigners, " +
                "Nampo-dong Street, Gukje Market, and Seomyeon market, located in the center of the city, are sought after places by Japanese and other foreign tourists. ");
        busan.setPhoto(R.drawable.busan_icon);
        busan.setTouristAttractions("Sighting in Busan (Pusan) can typically be classified into two groups: seashore and interior land sighting. Seashore sightseeing includes such " +
                "sights as the beach areas, islands, and Hae Ahn Park. While interior land sightseeing includes such sights as downtown Busan, historical ruins and sites, Dongnae " +
                "Shrine, Busan World Cup Stadium, and Bexco Exhibition and Convention Center. \n\nSurely Busan's most charming tourist point is its beautiful sea vistas. The southeastern" +
                " beach areas have amazing views of the fantastically shaped rocks and islands, which are a must see. The famous beaches of Haeundae, Gwangalli, and Songjeong are enjoyed " +
                "by many. Boating, jet skies, and banana boats are just among a few of the water recreation activities visitors can take advantage of. Amnam Park, Igidae, and Haean Park " +
                "offer views of nature's masterpieces. The natural beauties of Busan can also be taken in by riding the cruise boats in the harbor.\n\n" +
                "The summer months offer an array of festivals on almost every beach, while in the fall, the Jagalchi Fish market holds a cultural festival for foreign tourists. The " +
                "Nakdong Estuary Seasonal Bird Migration Site is a famous tourist spot in the winter. Since the release of the movie 'Chingu' (friend), which was filmed in Busan, Yongdusan" +
                " Park and Jagalchi Fish Market have become popular areas for tourists as well. \n\n" +
                "The Busan area has a plethora of places to dine. There is one street that is lined with Dongnae Pajeon (Korean style pancakes) and raw fish restaurants. Additionally, " +
                "some nearby museums include the Busan Marine Museum, Bokcheon Museum, Busan Metropolitan Art Museum, Busan Museum and many other cultural facilities. ");
        cities.add(busan);

        NewCity incheon = new NewCity();
        incheon.setName("Incheon");
        incheon.setPopulation(2966216);
        incheon.setHistory("The first historical record of the Incheon area dates back to 475 AD. during the reign of King Jangsu of Goguryeo by the name of Michuhol " +
                "which is supposed to be located on today's Munhak Hill. The area underwent several name changes with successive kingdoms and dynasties. In Goryeo era, " +
                "Incheon was called Gyeongwon or Inju. \n\nThe current name was established in 1413. Later, Incheon County became Incheon Metropolitan Prefecture (dohobu). " +
                "Old Incheon consisted of today's southern Incheon (i.e. Jung-gu, Dong-gu, Nam-gu, Yeonsu-gu, and Namdong-gu) and northern part of Siheung City. The city " +
                "centre was Gwangyo-dong, where the prefecture office and the local academy were located. The original two remaining buildings" +
                " of the Incheon prefecture office are located in Munhak Elementary School, while the newly built (in 2001) prefecture office buildings are right across from " +
                "Munhak Baseball Stadium.\n\n" +
                "However, the name Jemulpo was not widely used until the opening of the port in 1883. After the opening of the Incheon port, the city centre moved from " +
                "Gwangyo to Jemulpo. Today, either Jemulpo or Gwangyo-dong is considered Deep Incheon. It was renamed as Jinsen during Japanese rule in Korean peninsula.\n\n" +
                "Incheon was the site of the Battle of Chemulpo Bay, where the first shots of the Russo-Japanese War were fired. In 1914, the Japanese colonial government " +
                "merged outer parts of old Incheon (including the former centre of Gwangyo) with Bupyeong County, forming Bucheon County. Through 1936 and 1940, some part of " +
                "Bucheon County was recombined into Incheon City, by which some part of old Bupyeong was annexed into Incheon.\n\n" +
                "Incheon was occupied by North Korean troops in 4 September 1950. On September 15, 1950, during the Korean War, Incheon was the site of the Battle of Inchon, " +
                "when United States troops landed to relieve pressure on the Pusan Perimeter and to launch a United Nations offensive northward. The result was a decisive UN " +
                "victory and it was recaptured in 19 September 1950. The USS Inchon was named after the tide-turning battle that ensued.\n\n" +
                "Incheon was originally part of Gyeonggi Province, but was granted Directly Governed (now Metropolitan) City status on July 1, 1981; the city officially " +
                "separated from the province. In 1989, neighbouring islands and Gyeyang township of Gimpo County were ceded to Incheon and in 1995 Geomdan township of " +
                "Gimpo Country was annexed to Incheon Metropolitan City.\n\n" +
                "Incheon was known as Inchon prior to South Korea's adoption of a new Romanization system in 2000.");
        incheon.setTouristAttractions("Eurwangni Beach: Eurwangni Beach has a 700 meter-long white sand beach along a crescent-shaped coastline. " +
                "Surrounded by a charming grove of pine trees and unique rock formations, the beach is one of the most beautiful spots to watch the sunset in " +
                "Korea. The beach is crowded with visitors all year round as it has many leisure and convenience facilities, making it a prime location for a " +
                "variety of activities like swimming, water sports and fishing.\n\n" +
                "Incheon Landing Operation Memorial Hall: The Incheon Landing Operation Memorial Hall is a war memorial hall built to commemorate the centennial " +
                "anniversary of the opening of Incheon Port in 1984. Inside the building, there are photos of military armaments used by the South and North Korean " +
                "military as well as photos showing what life was like back then.");
        incheon.setBriefDescription("Incheon is the second largest port city in " +
                "Korea and was the first city in Korea to truly begin modernizing. " +
                "Wolmido Island and Yeonan Pier are top tourist attractions of Incheon and " +
                "Incheon International Airport, Incheon Bridge and Incheon Songdo International City, " +
                "a free economic zone, have recently emerged to show a new side of Incheon. Once getting " +
                "on the Incheon City Tour bus, you will have a chance to see all of Incheon's tourist attractions!");
        incheon.setPhoto(R.drawable.incheon_icon);
        cities.add(incheon);

        NewCity daegu = new NewCity();
        daegu.setName("Daegu");
        daegu.setPopulation(2467000);
        daegu.setHistory("With its geographically endowed fertile fields enclosed by Geumhogang River and its tributary Sincheon, " +
                "Daegu has been home to a large population since prehistoric times, helping the settlers to create a rich and unique " +
                "cultural heritage. \n\nArchaeologists have recently discovered microblades at the Paleolithic site in Wolseong-dong, revealing " +
                "that the city saw its beginnings some twenty thousand years ago. They have also established how Neolithic people settled " +
                "down on the alluvial lands around the small rivers to be found, such as today’s Seobyeon-dong in Buk-gu, Daebong-dong in " +
                "Jung-gu, and Sang-dong in Suseong-gu. \n\nIn the Bronze Age, numerous villages sprang up along the Geumhogang and Sincheon Rivers " +
                "and continued to expand with their growing populations, eventually resulting in the development of clan-based political entities. " +
                "\n\nThese early settlers in this part of Korea left a wealth of cultural remains, including undecorated pottery and dolmens. The tribal" +
                " state formed in today’s Daegu, in the first century BCE, was called either Dalgubeol or Dalgubul, and it was incorporated into Silla in the fourth century. ");
        daegu.setTouristAttractions("Daegu is one of Korea’s six major metropolitan cities and has many traditional tourist attractions such as Bullo-dong Ancient Tomb Park, " +
                "the largest concentration of ancient tombs in all of Korea and Daegu Bangjja Brassware Museum displaying brassware, one of Korea's traditional cultural " +
                "properties. \n\nThe City Tour Bus allows visitors to see Korean traditional educational institutions such as Dodongseowon Confucian Academy and Nokdongseowon " +
                "Confucian Academy as well as The ARC, a geometric-shaped exhibition hall. \n\nDuring weekends and national holidays, there is a special themed experience course.");
        daegu.setBriefDescription("Daegu is one of Korea’s six major metropolitan cities and has many traditional " +
                "tourist attractions such as Bullo-dong Ancient Tomb Park, the largest concentration of " +
                "ancient tombs in all of Korea and Daegu Bangjja Brassware Museum displaying brassware, one of Korea's " +
                "traditional cultural properties. \n\nThe City Tour Bus allows visitors to see Korean traditional educational " +
                "institutions such as Dodongseowon Confucian Academy and Nokdongseowon Confucian Academy as well as The ARC, " +
                "a geometric-shaped exhibition hall. During weekends and national holidays, there is a special themed experience course.");
        daegu.setPhoto(R.drawable.daegu_icon);
        cities.add(daegu);

        NewCity daejeon = new NewCity();
        daejeon.setName("Daejeon");
        daejeon.setPopulation(1552000);
        daejeon.setHistory("Human beings first settled in the Daejeon region during the Stone Age. It was occupied and in use as strategic military ground in various " +
                "time periods by people such as the Usul-gun of Baekje, Bipung-gun of Silla and the Hoideok-hyeon, Yuseong-hyeon, Deokjin-hyeon and Jinjam-hyeon. " +
                "\n\nDuring the Joseon Kingdom period, it remained occupied by the Hoideo-hyeon and Jinjam-hyeon of Gongju Mokha. In 1895, most of the area was made part of " +
                "Hoideok-gun and Jinjam-gun, excluding some parts that belonged to Gongju-gun");
        daejeon.setTouristAttractions("Donghak-sa Temple: A picturesque temple outside of Daejeon in the adjacent city of Gongju, but linked in on the Daejeon bus routes. " +
                "In addition to the temple, the valley contains restaurants, hotels and saunas (including a fair few of the funky \"hobbit mushroom\" styled ones) and a fairly " +
                "dramatic waterfall, albeit dry much of the year. \n\nThis all falls within Gyeryongsan National Park. A well stocked tourist information booth exists at the entrance" +
                "and is an ideal starting point for a hiking trip over the region. Restaurants in the area tend to be well catered towards foreign (primarily Japanese) tourists " +
                "with picture menus of the most popular items: a rarity in central South Korea. To get in, the 107 bus will take you from Daejeon Korail station direct, although " +
                "it is much faster to take the subway to the National Cemetary station, and hop on the 107 there as it prepares to zip out of town. The bus stop is right next to " +
                "the subway exit." + "\n\nYuseong Foot Spa: A heated foot spa. The temperature is pretty high but varies along the length so it's appropriate even in winter, and you " +
                "won't overheat in summer. Note that unlike most foot spas, the local populace demands pre-washing of feet at the wash-station at the end of the footspa prior to " +
                "entering (akin to the etiquette of a full body public bathhouse). \n\nDrop your stuff where you intend to sit, then walk down the end, wash up, and walk down the spa " +
                "to get back to your seat. It can be an embarrassingly fulfilling sight seeing the eldery locals accosting Korean visitors from elsewhere in Korea unaware of this " +
                "unstated rule. To get there, leave the subway station and head towards the main Yuseong junction to the north. Turn east and follow the wide grassy median strip " +
                "about 500 m down the road.");
        daejeon.setBriefDescription("Daejeon is the 5th largest city in South Korea, with a population of approximately 1.5 million. It is located in the centre of " +
                "Korea and is at the crossroads of national rail and road transport routes, the Gyeongbu railway, Honam railway, Gyeongbu Expressway, and Honam Expressway.\n\n" +
                "Daejeon hosted Taejeon Expo '93, during which 108 countries participated and 14 million visitors attended.\n" +
                "The city has been promoted as a city of science and education centred about Daedeok Science Town, more lately called Daedeok Innopolis." +
                " The Daejeon municipal government dubs itself a core city of research and development and the cradle of Korea's cutting-edge science sector\n\n" +
                "More than 200 research institutes, including the research and development facilities of Samsung, LG, Korea University of Science and Technology, are " +
                "located within Daedeok Science Town in Yuseong-gu on the far outskirts of town, locally referred to as Daedeok Techno Valley. This, plus the Daedeok Innopolis " +
                "cluster of KAIST, Chungnam National University and government research institutes lend themselves to the city's local nickname: the Silicon Valley of Korea.\n" +
                "Like all cities in Korea, Daejeon has adopted a Konglish town slogan: It's Daejeon. For those who actually care, the it's is meant to be an backronym expressing; " +
                "Interesting, Tradition and Culture, Science and Technology.\n\n" +
                "Yuseong Hot Springs Resort and Daecheong Dam are amongst the city's most popular tourist attractions.");
        daejeon.setPhoto(R.drawable.daejeon_icon);
        cities.add(daejeon);

        NewCity gwangju = new NewCity();
        gwangju.setName("Gwangju");
        gwangju.setPopulation(1522000);
        gwangju.setHistory("The city was established in 57 BC. It was one of the administrative centres of Baekje during the Three Kingdoms Period.\n" +
                "In 1929, during the period of Japanese rule, a confrontation between Korean and Japanese students in the city turned into a regional demonstration, " +
                "which culminated in one of the major nationwide uprisings against Japanese rule during the colonial period.\n\n" +
                "Modern industry was established in Gwangju with the construction of a railway to Seoul. Some of the industries that took hold include cotton textiles, " +
                "rice mills and breweries. Construction of a designated industrial zone in 1967 encouraged growth in industry, especially in the sectors linked to the automobile industry.\n" +
                "\n\nIn May 1980, peaceful demonstrations took place in Gwangju against the newly installed military government of Chun Doo-hwan. The demonstrations were " +
                "suppressed by military forces, including elite units of the Special Operations Command. The situation escalated after a violent crackdown, " +
                "resulting in the Gwangju Uprising, where the civilians raided armories and armed themselves. By the time that the uprising was suppressed, many hundred " +
                "civilians and several policemen / soldiers were dead. After civilian rule was reinstated, a national cemetery was established honouring the victims of the incident.\n\n" +
                "In 1986, Gwangju separated from Jeollanam-do to become a Directly Governed City (Jikhalsi), and then became a Metropolitan City (Gwangyeoksi) in 1995.\n\n" +
                "Gwangju is the main campaign capital of the liberal Democratic United Party, and its predecessors.");
        gwangju.setTouristAttractions("Asian Culture Complex Information Center – As of October 2010, the Asian Culture Complex is under construction and is due to open in 2014. " +
                "The Asian Culture Complex Information Center is in operation.More about Asian Culture Complex Information Center\n\n" +
                "Gwangju Biennale – This is a modern art festival that is held every two years. It was first launched in 1995. The Gwangju Biennale Exhibition Hall is" +
                "located at the Jung-oe Park Culture Center and the Science Center.\n\n" +
                "Gwangju Culture & Art Center – The Center regularly hosts events.Gwangju Culture & Art Center Official Website\n\n" +
                "Gwangju Hyanggyo (Confucian School) – Gwangju Hyanggyo is located in the Gwangju Park in Sa-dong. There are traditional houses here estimated as built " +
                "during the 1st year of the Joseon Dynasty in 1392. This school continues to hold memorial ceremonies for Confucius twice a year. Admission is free. More about " +
                "Gwangju Hyanggyo\n\n" +
                "Gwangju National Museum – The museum houses a permanent collection of historical art and cultural relics that date back to the old Joseon and Goryeo periods of " +
                "Korean history. The museum also organizes exhibitions and cultural learning activities that are open to the public.\n\n" +
                "Gwangju 5.18Road – 5.18 Road is the course about the Democratisation Movement in 1980. The courses include the historical places. More about 5.18Road");
        gwangju.setBriefDescription("Gwangju is the sixth largest city in South Korea. It is a designated metropolitan city under the direct " +
                "control of the central government's Home Minister. The city was also the capital of South Jeolla Province until the provincial office moved to the southern village " +
                "of Namak in Muan County in 2005.\n\n" +
                "Gwang means light and Ju means province. Areas of scenery along the outskirts of the city gave birth to gasa," +
                " a form of Korean classical poetry.[citation needed] Located in the center of the agricultural Jeolla region, the city is also famous for its rich and diverse cuisine.");
        gwangju.setPhoto(R.drawable.gwangju_icon);
        cities.add(gwangju);

        NewCity jeju = new NewCity();
        jeju.setName("Jeju");
        jeju.setPopulation(604771);
        jeju.setHistory("Every Korean student learns about the history of Jeju during their time at school because Jeju Island is a place where history is " +
                "still alive. Let’s take a look at Jeju’s history from the " +
                "Three Kingdom Period through the Goryeo and Choseon Dynasties and Japanese colonial period, and up to the tumultuous years of modern history. \n\nTamna is " +
                "Jeju’s old name, meaning “island country.” The process of settlement of Tamna on Jeju Island is illustrated by Tamna’s settlement myth, " +
                "which is known as Samseong shinhwa. \n\nTo see archaeological evidence of the early settlement of Jeju, visit Samyang-dong Prehistoric Site, " +
                "which has been designated Historic Site No.416. The site contains the earliest known and largest residential remains in Jeju, dating back to the " +
                "third century B.C. during the proto-Three Kingdoms Period. This site shows society during the period of Tamna formation (200 B.C. ~ 200 A.D.) Tamna is" +
                " known to have been an active trading partner with Baekje, Goguryeo and Silla during the Three Kingdoms Period. \n\nTamna also had diplomatic relations with" +
                " the Dang Dynasty in China and Japan after Baekje was destroyed by an allied force of Silla and Dang. Tamna was historically known as the independent Kingdom" +
                " of the Sea. It became subjected to the Goryeo Dynasty, and its name was changed to Jeju. meaning a big province across the sea.");
        jeju.setTouristAttractions("MOUNT HALLASAN: Up for a hike? Then climb Korea’s highest mountain, Mt Hallasan! Located in the centre of Jeju Island, Mt Hallasan is a " +
                "dormant volcano that is listed as a UNESCO World Natural Heritage sites. Despite its high altitude, it is quite easy to climb and most people can make it to the " +
                "peak and back down within a day. From the peak, hikers are rewarded with a huge beautiful crater lake as well as breathtaking views of Jeju." +
                "\n\n LOVELAND: This is one for Mummy and Daddy, kids. Open only to those above the age of 18, Loveland is – you’ve guessed it – a park focused on sexuality and " +
                "eroticism. 140 sculptures of men and women in various states of undress and different sex positions litter the park, all of them works of students from Hongik " +
                "University. Other elements you can find in Loveland include large phallic statues, stone labia and hands-on exhibits. ");
        jeju.setBriefDescription("Located southwest of the Korean Peninsula, Jeju Island is a popular tourist destination for both domestic and international travelers alike " +
                "for its beautiful and pristine natural sceneries. The island is home to a number of UNESCO designated World Natural Heritage sites such as Manjanggul Cave and " +
                "Seongsan Ilchulbong Peak, as well as, distinct tourist attractions like the numerous oreums (Jeju dialect for small volcanic cones) scattered around the island.\n" +
                "\n\nAs major attractions are scattered across the island, joining a city tour bus would be a great option to get around Jeju. The island travelers can choose from " +
                "the two types of city tour that best fit their travel itinerary. One is Jeju city tour bus that passengers pay for the ride each time they get on board. The other is " +
                "Jeju Golden Bus City Tour that you can hop on and off whenever and whenever.");
        jeju.setPhoto(R.drawable.jeju_icon);
        cities.add(jeju);

        NewCity ulsan = new NewCity();
        ulsan.setName("Ulsan");
        ulsan.setPopulation(1124000);
        ulsan.setHistory("Until the early 1960s, the city of Ulsan was a fishing port and agricultural center. However, as the " +
                "Ulsan Industrial District began to build up in 1962, it emerged as an industrial center of Korea. \n\nThe city became " +
                "home to major industrial plants and factories, which include oil refineries, chemical plants, and the multinational " +
                "Hyundai Corporation’s ship building and automobile production factories. Ulsan is well positioned for the transportation of people and materials. ");
        ulsan.setTouristAttractions("Hyundai Motor Company: Hyundai Motor Company's plant in Ulsan is the world's largest automobile manufacturing site. Hyundai entered " +
                "the car manufacturing industry in 1968 by partnering with the Ford Motor Company to produce Britain's popular family car, the Cortina. Since launching its " +
                "first Korean model (the Pony) in 1975, Hyundai has developed into a leading global auto manufacturer."
                + "\n\nDaewangam Park: Daewangam Park has a beautiful walking trail along the coastal cliff. The rock island on the sea can be reached by an iron bridge. " +
                "There is a legend that King Munmu (Silla Kingdom) was buried under the rock island to guard the kingdom after his death. The park's fantastic rock outcroppings" +
                " and an estimated 15,000 pine trees over 100 years old provide a refreshing place to relax.");
        ulsan.setBriefDescription("Ulsan is Korea’s top Industrial city. With its warm climate and three major ports (Ulsan Port, Onsan Port and Bangeojin Port), " +
                "Ulsan is the hub of Korean shipbuilding and a major trade gate for East Asia. \n\nWhile Ulsan is primarily known as an industrial city, it is also " +
                "famous for beautiful natural sites along its coast. " +
                "Continue reading for an in-depth look into an Ulsan City Tour that lets visitors see the blue oceans, " +
                "beautiful landscapes, and historical attractions.");
        ulsan.setPhoto(R.drawable.ulsan_icon);
        cities.add(ulsan);

        NewCity suwon = new NewCity();
        suwon.setName("Suwon");
        suwon.setPopulation(946704);
        suwon.setHistory("In ancient tribal times, Suwon was known as Mosu-guk). During the Three Kingdoms era, however, " +
                "the area comprising modern Suwon and Hwaseong City was called Maehol-gun.\n\n" +
                "In 757, under King Gyeongdeok of the Unified Silla, the name was changed to Suseong-gun. In 940 " +
                "during the Goryeo Dynasty, the name was changed again in to Suju. King Taejong of the Joseon Dynasty renamed the city to Suwon in 1413.\n" +
                "\nIn 1592, during the Imjin wars, Commander Yi Kwang attempted to launch his army toward the capital city, Seoul " +
                "(at the time called Hanseong). The army was withdrawn, however, after news that the city had already been sacked" +
                " reached the commander. As the army grew in size to 50,000 men with the accumulation of several volunteer forces, " +
                "Yi Kwang and the irregular commanders reconsidered their aim to reclaim the capital, and led the combined forces north to Suwon.");
        suwon.setTouristAttractions("Hwaseong Fortress was built as part of a planned city constructed by King Jeongjo, the 22nd monarch of the Joseon Dynasty. " +
                "It served as the southern gate of the capital city of Seoul during the Joseon Dynasty. Located in Suwon, Gyeonggi-do, the area of Hwaseong Fortress" +
                " served as a strategic site for military security as well as key site for commerce. \n\nToday, Hwaseong Fortress is surrounded by many roads both small and " +
                "large, in addition to the Gyeonggi Provincial Government Building, giving " +
                "all the opportunity to view the scenic juxtaposition of old and modern architecture. For a quick and convenient way to visit a variety of attractions " +
                "during your stay in Suwon, take a ride on the Suwon City Tour, operated by the city Government. \n\nAccompanied by guides who are proficient in English and" +
                " Japanese, you'll be able to ride in comfort as you discover some of the most celebrated treasures of the city.");
        suwon.setBriefDescription("Suwon is the capital and largest metropolis of Gyeonggi-do, South Korea's most populous province which surrounds Seoul, the national capital. " +
                "Suwon lies about 30 km (19 mi) south of Seoul. It is traditionally known as The City of Filial Piety. With a population close to 1.2 million, it is larger than Ulsan, " +
                "although it is not governed as a metropolitan city. \n\nSuwon has existed in various forms throughout Korea's history, growing from a small settlement to become a major " +
                "industrial and cultural center. It is the only remaining completely walled city in South Korea. The city walls are one of the more popular tourist destinations in " +
                "Gyeonggi Province. Samsung Electronics R&D center and headquarters are based in Suwon. The city is served by two motorways, the national railway network, and the " +
                "Seoul Metropolitan Subway. Suwon is a major educational center, home to 11 universities. \n\nSuwon is home to Suwon Samsung Bluewings Football Club, which have won the " +
                "K-league on four occasions[4] and AFC Champions League twice. The KT Wiz of the Korean Baseball Organization also call Suwon home.");
        suwon.setPhoto(R.drawable.suwon_icon);
        cities.add(suwon);
        return cities;
    }
}
