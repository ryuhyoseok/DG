package SimpleSocketServer;

import java.util.EnumMap;


public final class Constants {
	
	//For normal distribution
	public static double DEFAULT_STANDARD_DEVIATION = 1;
	public static double DEFAULT_MEAN = 0;
	
	
	
	public static int[] PROB_USER_PUB = {100, 100, 100};
	public static int[] PROB_USER_SUB = {100, 0, 0};
	
	public static int[] PROB_CLASSIFICATION_PUB = {100, 100};
	public static int[] PROB_CLASSIFICATION_SUB = {100, 100};
	
	public static int[] PROB_STORE_PUB = {100, 100, 100, 100, 100, 100};
	public static int[] PROB_STORE_SUB = {0, 0, 100, 100, 100, 100};
	
	public static int[] PROB_ETC_PUB = {100, 100, 100};
	public static int[] PROB_ETC_SUB = {0, 0, 100};
	
	public static int[] PROB_PUBLISHER_SUB = {100, 100};
	
	
	public static String[] GENDERLIST = {"Male", "Female"};
	
	public static String[] AGERANGELIST = {"10", "20", "30"};
	
	public static 	String[] CATEGORYLIST = {"Food", "Fun"};
	
	public static String[] SUBCATEGORYLISTOFFOOD = {"Korean", "Chinese", "Japanese", "Western" };
	public static String[] SUBCATEGORYLISTOFFUN = {"Liquid", "Amusements", "Talking", "Culture" };
	
	public static String[] STORENAMES= {
	    "Wossner","Gunderson","Comte","Linnainmaa","Harbusch","Speek",
	    "Trachtenberg","Kohling","Speel","Nollmann","Jervis","Capobianchi",
	    "Murillo","Speer","Claffy","Lalonde","Nitta","Servieres","Chimia",
	    "Boreale","Taubenfeld","Nitto","Walston","Danley","Billawala",
	    "Ratzlaff","Penttonen","Pashtan","Iivonen","Setlzner","Reutenauer",
	    "Hegner","Demir","Ramaiah","Covnot","Nitsch","Thummel","Axelband",
	    "Sevcikova","Shobatake","Greibach","Fujisaki","Bugrara","Dolinsky",
	    "Dichev","Versino","Gluchowski","Dahlbom","Suri","Parveen","Businaro",
	    "Taneja","Morrey","Siochi","Alameldin","Genin","McAlpine","Sury",
	    "Angel","Sambasivam","Bazelow","Demke","Anger","Brendel",
	    "Cappelletti","Walstra","Hebden","Carrera","Brender","Carrere",
	    "Kalloufi","Katzenelson","Jeansoulin","Renear","Zuberek","Snyers",
	    "Heusch","Perfilyeva","Serdy","Seiwald","Bierbaum","Weedon","Gimarc",
	    "Egerstedt","Stemann","Menhoudj","Bugaenko","Gide","Vilarrasa",
	    "Brobst","Bruckman","Imataki","Engberts","Ghelli","Flanders",
	    "Nannarelli","Farrag","Comyn","Msuda","Kilgore","Farrar","Reistad",
	    "Kamber","Cooley","Suomi","Restivo","Eterovic","Gien","Ramamoorthy",
	    "Szilard","Vesel","Tanemo","Lanteri","Rosenbaum","Mayerwieser",
	    "Takanami","Heuser","Wiegley","Pillow","Underwood","Morrin",
	    "Schiettecatte","Aingworth","Morris","Petersohn","Majewski","Remmele",
	    "Sudbeck","Thibadeau","Beznosov","Rijsenbrij","McFarlan","Esteva",
	    "Varker","Spell","Karlin","Begiun","Lanzelotte","Suwa","Spelt",
	    "Demos","Bergere","Usdin","Clouatre","Makinen","Thebaut","Kowalchuk",
	    "Velardi","Stanfel","Bellmore","Godskesen","Champarnaud","Murtha",
	    "Himler","Gecseg","Kalsbeek","Gecsei","Besselaar","Pokrovskii",
	    "Senzako","Ruemmler","Gecsel","Zumaque","Guardalben","Murthy",
	    "Kilgour","Nicolson","Desikan","Gihr","Jeong","Socorro","Vingron",
	    "Cusworth","Magalhaes","Farrel","Kambil","Lubachevsky","Fendler",
	    "Willoner","Thimonier","Koshiba","Castellani","Tischendorf","Seuren",
	    "Ashish","Schneeberger","Dusink","Cummings","Bisiani","Kemmerer",
	    "Demri","Schusler","Undy","Kabayashi","D'Aloisi","Seghrouchni",
	    "Meriste","Deverell","Oxenboll","Kugler","Winter","Strehl","Danlos",
	    "Christianini","Beutelspacher","Furedi","Barinka","Sabnani",
	    "Hooghiemstra","Schicker","Sewelson","Onuegbe","Orlowska","Sinicrope",
	    "Alencar","Kusakabe","Herath","Orlowski","Gyimothy","Backhouse",
	    "Vidal","Yetim","Siepmann","Streit","Sankaranarayanan","Lagarias",
	    "Henders","Horswill","Basart","Joslin","Atchley","Vitiello","Kamble",
	    "Staudhammer","Fioravanti","Rabejac","Angelopoulos","Takkinen",
	    "Callaway","Morrow","Plesums","Salinas","Gilg","Liesche","Crouzet",
	    "Peternell","Suessmith","Rabehasaina","Gill","d'Astous","Redmiles",
	    "Remmers","Gils","Trogemann","Ecklund","Kitai","Leppanen","Angot",
	    "Serna","Blokdijk","Krychniak","Tetzlaff","Gente","Markovitch",
	    "Farris","Rattan","Parascandalo","Fujisawa","Erdmenger","Thorensen",
	    "Wursthorn","Srimani","Barriga","Veeraraghavan","Gajiwala",
	    "Grospietsch","Pezzoli","Emmart","Budinsky","Sommen","Ladret",
	    "Frolund","DuCasse","Leijenhorst","Vesna","Sommer","Gini","Ritcey",
	    "McFarlin","Moffat","Serot","Dalphin","Serov","Clemencon","Heinisuo",
	    "Heijenga","Worfolk","Grandbois","Minakawa","Schrift","Knightly",
	    "Tasistro","Curless","Verhoeff","Casley","Soicher","Hellwagner",
	    "Montemayor","Simkin","Bresenham","Chelton","Norsworthy","Chepyzhov",
	    "Harllee","Mitsuhashi","Quaggetto","Hainaut","Schwartzburd","Ariola",
	    "Basawa","Mukaidono","Ranai","Streng","Fritzsche","Doering","Hofmeyr",
	    "Binding","Boguraev","Uehara","Conde","Miake","Poupard","Ferretti",
	    "Crabtree","Honiden","Wolniewicz","Gips","Heping","Baaleh","Serra",
	    "Stasinski","Serre","Baalen","Erman","Acton","Radhakrishnan",
	    "Hoppenstand","Passafiume","Diderrich","Ossenbruggen","Gewali",
	    "Ohori","Duclos","Pardalos","Ducloy","Czaja","Mandell","Matheson",
	    "Aloia","Zastre","Cherinka","Coney","Gire","Litecky","Stifter",
	    "Krichel","Haldar","Monarch","Malabarba","Shackell","Itzigehl",
	    "Cappelli","Rande","Gadepally","Cappello","Randi","Felcyn","Krupka",
	    "Wielonsky","Rando","Kossowski","Farrow","Unni","Talmon","Randt",
	    "Leuchs","Unno","Talmor","Spieker","Brlek","Matzat","Bouloucos",
	    "Gist","Rodham","Apsitis","Vickson","Kornyak","Kragelund","Radwan",
	    "Plotkin","Rusterholz","Stentiford","Lowrie","Antonakopoulos",
	    "Slobodova","Bashian","Kranzdorf","Chenoweth","Gulak","Negoita",
	    "Raney","Lanphier","Rettelbach","Siprelle","Deville","Shumilov",
	    "Klyachko","Ermel","Servi","Gornas","Lammel","Rosar","Ranft","Conia",
	    "Theuretzbacher","Rosay","Rosaz","Schlegelmilch","Montresor",
	    "Syrzycki","Caine","Koshino","Feldhoffer","Garnham","Mellouli",
	    "Skafidas","Breugel","Dalton","Geffroy","Zobel","Range","Terkki",
	    "Naumovich","Yetto","Heiserman","Weiland","Mahmud","Kuzuoka","Butner",
	    "Selvestrel","Rissanen","Litvinov","Rosca","Heystek","Kushner",
	    "Khasidashvili","Siksek","Muchinsky","Rosch","Hiroyama","Ponthieu",
	    "Lichtman","Matzel","Miara","Matzen","Burnard","Maksimenko",
	    "Maginnis","Journel","Ravishankar","Schwabacher","Griswold",
	    "Lindqvist","Eiron","Ferriere","Figueira","Manders","Whitcomb",
	    "Tempesti","Gimbel","Kalefeld","Birdsall","Kaiserswerth","Lally",
	    "Fiebach","Cesareni","Gonthier","Benantar","Ozeki","Staylopatis",
	    "Haumacher","Jarecki","Rosen","Heydon","Itzfeldt","Kroft","Munch",
	    "Pocchiola","Munck","Hiraishi","Chinal","Bojadziev","Pargas","Ranka",
	    "Isaac","Cairo","Melichar","Krogh","Smailagic","Crelier","Isaak",
	    "Rebaine","Gischer","Highland","Makrucki","Gargeya","Zaumen",
	    "Levasseur","Ebeling","Ibel","Kroha","Kisuki","Rissland","Kushnir",
	    "Hiyoshi","Mundy","Oxman","Binkley","Speckmann","Validov","Kusakari",
	    "Bodoff","Shigei","Zlotek","Krohm","Krohn","Pettey","Mitzlaff",
	    "Ramras","Sluis","Vakili","Hennings","Ratnakar","Nyrup","Standera",
	    "Landherr","Lipner","Levergood","Foong","Porotnikoff","Honglei",
	    "Jullig","Birrer","Katalagarianos","Gulik","Mansanne","Hanabata",
	    "Noriega","Fargier","Mitina","Dredge","Pileggi","Wilharm","Xiaoshan",
	    "Raczkowsky","Malinowski","Suermann","Rosin","Matzke","Vecchio",
	    "Aumann","Trumbly","Rosis","Herber","Whittlesey","Bolotov","Solovay",
	    "Boudaillier","Ghazalie","Kopetz","Chinen","Waeselynck",
	    "Fortenbacher","Stenning","Zirintsis","Luders","Krider","Ranon",
	    "Fasbender","Dehkordi","Chartres","Hanratty","Wuwongse","Waymire",
	    "Dechter","Beausoleil","Mawatari","Ghalwash","Munawer","Birnbaum",
	    "Kobuchi","Pettis","Pettit","Kroll","Conry","Melski","Gulla",
	    "Chappelet","Quittner","Bridgland","Sooriamurthi","Ratnaker",
	    "Barbanera","Angiulli","Marciano","Rohrbach","Peral","Dengi","Muniz",
	    "Thombley","Strooper","Chleq","Riesenhuber","Schieder","Ozeri",
	    "Escriba","Salverda","Lienhardt","Felder","Vrecion","Zeilberger",
	    "Rehfuss","Glowinski","Conta","Borovoy","Ozery","Conte","Furudate",
	    "Broomell","Conti","Wixon","Krone","Mapelli","Zolotykh",
	    "Gopalakrishnan","Reeken","Hofstetter","Reeker","Munke","Sigstam",
	    "Demeyer","Yurek","Nanard","Brookman","Fandrianto","Stassinopoulos",
	    "Deyuan","Matzov","Chinin","Masada","Menyhert","Rajcani","Cooman",
	    "Rousseau","Foote","Poulakidas","Ushiama","Denis","Eppinger",
	    "Showalter","Kroon","Anandan","Zedlitz","Pagter","Hitomi","Peltason",
	    "Ranst","Saoudi","VanScheik","Frijda","Swiler","Navazio","Kadhim",
	    "Ranta","Vidya","Kropf","Mitchem","Braccini","McClure","Coombs",
	    "McClurg","Kropp","Schurmann","Koprowski","Garigliano","Cronan",
	    "Tsunoo","Beerel","Syrotiuk","Khalid","Cronau","Camarinopoulos",
	    "Rassart","Khalil","Hoogerwoord","Peres","Perez","Olivero","Ranum",
	    "Tchuente","Collavizza","Nittel","Osgood","Masamoto","D'Auria",
	    "Wilfing","Narahara","Kirkerud","Zwicker","Cichocki","Staelin",
	    "Narahari","Mondadori","Asrin","Zeidenstein","Give'on","Docker",
	    "Kandlur","Munos","Mateescu","Shiratori","Bolsens","Cyne","Fordan",
	    "Birjandi","Samarati","Munoz","Parhami","Shrader","Adachi","Kavanagh",
	    "Reinhard","Constantine","Flasterstein","Berendt","Skrikant",
	    "Vuskovic","Kornatzky","Denna","Slutz","Bernardinello","Reinhart",
	    "Shokrollahi","Terwilliger","Mullainathan","Heuter","Fabrizio",
	    "Buchter","Gladwell","Plessier","Rossi","Preusig","Baezner","Debuse",
	    "Denny","Rodiger","Kalorkoti","Iacovou","Templeman","Velasco",
	    "Thiran","Cardazo","Zyda","Kitsuregawa","Perin","Kavvadias","Varley",
	    "Huhdanpaa","Marakhovsky","Peris","Rosti","Narlikar","Denos",
	    "Facello","Hammerschmidt","Chvatal","Reghbati","Wegerle","Stanger",
	    "Munro","Kusalik","Pleszkun","Ranze","Masaki","Maierhofer","Itschner",
	    "Moehrke","Gubsky","Karunanithi","Plavsic","Lundstrom","Suppi",
	    "Janocha","Pintelas","Peac","Ghandeharizadeh","Biran","Gustavson",
	    "Baranowski","Hertweck","Peak","Cyre","Welham","Akaboshi","Codenie",
	    "Guenter","Perko","Ouhyoung","Riexinger","Keirsey","DuBourdieux",
	    "Rusmann","Schreiter","Maliniak","Gruenwald","Alvarado","Prampolini",
	    "Falster","Hennebert","Tibblin","Benzmuller","Maquelin","Siegrist",
	    "Sullins","Muntz","Isard","Fraisse","Picci","Perly","Thorelli",
	    "Picco","Birch","Herbst","Cronin","Stavenow","Lenart","Hagimont",
	    "Jiafu","Eldridge","Antonisse","Naudin","Ghemri","Yurov","Peck",
	    "Akiyama","Alpay","Puoti","Masand","Detkin","Verspoor","Gammage",
	    "Georg","Miculan","Bernick","Matteis","Decleir","Henseler",
	    "Nishimukai","Pollacia","Perna","Uhrig","Schlumberger","Cheshire",
	    "Camurati","Nourani","Perng","Uhrik","Denti","Waleschkowski",
	    "Woycyznski","Bultermann","Pearson","Przulj","Lieberherr","Stamatiou",
	    "Picel","Wissmann","Papadias","Jumpertz","Mahnke","Kakkad","Zallocco",
	    "Peek","Lamparter","Laurillard","Polajnar","Peron","Bamford",
	    "Valtorta","Bratten","Kakkar","Peroz","Litzkow","Brizzi","Stroustrup",
	    "Stellhorn","Cannane","Rosiles","Sgarro","Leaver","Yavatkar",
	    "Bottner","Lamba","Delgrande","Ramalingam","Lodder","Erbe","Zykh",
	    "Braunschweig","Lambe","Thiria","Prenel","DasSarma","Bardell",
	    "Cromarty","Birge","Basagni","Steinauer","Szemeredi","Borstler",
	    "Nivat","Ellozy","Danecki","Rothenberg","Pietracaprina","Oppitz",
	    "Tzvieli","Zucker","Muhlberg","Peha","Fiutem","Piveteau",
	    "Bernardeschi","Tramer","Michaeli","Picht","Botman","Tsukuda",
	    "Vendrig","Irland","Belinskaya","Tokunaga","Pehl","Perri","Michaels",
	    "Syang","Poujol","Marwedel","Rikino","Erde","Yeung","Erdi","Perry",
	    "Panwar","Pramanik","Hebert","Szmurlo","Kenevan","Nergos","Usery",
	    "Alblas","Swick","Bednarek","Tyugu","Aamodt","Cunliffe","Holburn",
	    "Peir","Barvinok","Delgrange","Demian","Sidhu","Pouyioutas",
	    "Georgakopoulos","Esposito","Juneja","Erev","Klerer","Wroclawski",
	    "Andreotta","Cannard","Erez","Zweizig","DiGiano","Zambonelli",
	    "Schnabel","Cochrane","Ananiadou","Swab","Sessa","Krzyzanowski",
	    "Gyorkos","Ambroszkiewicz","Christ","Werthner","Famili","Jiang",
	    "Swan","Birke","Poehlman","Katiyar","Rouquie","Alpin","Hasenauer",
	    "Rullman","Sidje","Brattka","Miyakawa","Ventosa","Zaiane","Ressouche",
	    "Kleiser","Massonet","Schrooten","Koblick","Paludetto","Shanbhogue",
	    "Gronowski","Brodal","Rindone","Stafford","Azulay","Homond",
	    "Valiente","Harnett","Wrigley","Pelc","Dulay","Hettesheimer",
	    "Spinelli","Sifakis","Buescher","Cannata","Cmelik","Uchoa","Nilsson",
	    "Bratsberg","Pell","Manderick","Qiwen","McConalogue","Swift",
	    "Marzano","Ullian","Feldmann","Lorch","Mattern","Ruther","Pelz",
	    "Azevdeo","Rathonyi","Marrevee","Zhiwei","Brandsma","Ligten",
	    "Jakobus","Gurbaxani","Collette","Hofman","Mamelak","Zultner","Lorcy",
	    "Lieblein","Ritzmann","Beilner","Zongker","Ulupinar","Piazza",
	    "Pollock","Casperson","Lakshmanan","Erie","Roohalamini","Fairtlough",
	    "Cincotta","Wallrath","Giaccio","Pena","Peng","Porenta","Chachaty",
	    "Byoun","Butterworth","Penn","Grabner","Tomescu","Bharadwaj",
	    "Boissier","Viele","Valette","Kobara","Murtafg","Sadowski","Penz",
	    "Bernini","Swen","Bakhtari","Lores","Biron","Sadowsky","Biros",
	    "Engelmann","Shihab","Peot","Provine","Murtagh","Schonegge","Olano",
	    "Marshall","Broder","Sinitsyn","Emden","Pepe","Kinley","Cooke",
	    "Motley","Kawashima","Sudkamp","Garnick","Strandh","Flexer",
	    "Petereit","McDermid","Rodier","Yoshimura","Sidou","Kawashimo",
	    "Roccetti","Hofting","Parfitt","Daescu","Birsak","Domenig",
	    "Picaronny","Iwayama","Maraist","Feinberg","Keohane","Delaune",
	    "Lamma","Bhattacharjee","Shackel","Cools","Guting","Baumann",
	    "Fadgyas","Kropatsch","Czap","Rotem","Lorho","Vecchi","Straney",
	    "Melter","Jayawardene","Fetvedt","Roisin","Prochazka","Granlund",
	    "Tsukune","Perl","Aseltine","Pero","Keustermans","Lorie","Garnier",
	    "Veccia","Braunmuhl","Perz","Erni","Lorin","Junet","Jording",
	    "Vandervoorde","Paciorek","Schmiedel","Comellas","Schwartzbauer",
	    "Mikschl","Tagansky","Sridhar","Azuma","Panienski","Uludag",
	    "Sundgren","Brodie","Chenney","Eickenmeyer","Dulin","Iisaka","Birta",
	    "Ramsak","Azumi","Albarhamtoshy","Erol","Nastansky","Hedayat",
	    "Lichtner","Armand","Hempstead","Bressoud","Ramsay","Iisaku",
	    "Busillo","Marrakchi","Atrawala","Vural","Rothe","Magliocco","Neiman",
	    "Lampe","Vieri","Giarratana","Neimat","Schauser","Smeets","Couchot",
	    "Savasere","Heyers","Liedekerke","Fontan","Rajala","Solares",
	    "Gerteisen","Brickell","Thambidurai","Emiris","Mandelberg","Kaiser",
	    "Chiodo","d'Argence","Goldhammer","Sichman","Narwekar","Lindenbaum",
	    "Kaminger","Kavraki","Gelosh","Assaf","Koyama","Zschoche",
	    "Papastamatiou","Kalafatis","Billingsley","Scharstein","Benaini",
	    "Plumb","Kolinko","Hambrick","Soloway","Plump","Zizka","Beetstra",
	    "Dulli","Larfeldt","O'Halloran","Arlazarov","Vieth","Condotta",
	    "Yemenis","Bondorf","Lyonns","Coorg","Hartvigsen","Vadhan","Dymetman",
	    "Zielinski","Kampfer","Bellone","Pews","Coors","Rijckaert","Stranks",
	    "Heemskerk","Waschkowski","Kulisch","Goodrum","Schmittgen",
	    "Waterhouse","Radivojevic","Roison","Ramsey","Marchegay","Leslie",
	    "Verhaegen","Hmelo","Zockler","Nations","Muhling","Shimshoni",
	    "Marletta","Marsiglia","Kaltofen","Lemarechal","Ertl","Pulkowski",
	    "Luan","Leonhardt","Huttel","O'Haver","Improta","Hutter","Fontet",
	    "Hinsberger","Menhardt","Calkin","Peyn","Decaestecker","Linares",
	    "Madeira","Swiss","Piancastelli","Swist","Pargaonkar","Nyanchama",
	    "Danner","Stiles","Bauknecht","Besancenot","Salvesen","Asser",
	    "Einsfeld","Luby","Anick","Schlenzig","Ginesta","Terlouw","Rahier",
	    "Pesch","Badache","Potthoff","Warwick","Haraldson","Luca",
	    "Garrabrants","Trystram","Erva","Delgrossi","Luce","Attimonelli",
	    "Compeau","Luck","Merel","Dratva","Legleitner","Scallan","Rubsam",
	    "Barreiro","Etalle","Niizuma","Merey","Vanwelkenhuysen","Anido",
	    "Bonifati","Openshaw","Portugali","Chandrasekhar","Veevers","Ciolek",
	    "Melton","Ernst","Mungall","Varman","Panangaden","Wendorf","Karner",
	    "Pauthner","Luef","Lueh","Litzler","Ballarin","Junot","Koblitz",
	    "Chiola","Schwaller","Steenbeek","Schoegge","Marquardt","Zeleznik",
	    "Raoux","Baak","Schnelling","Limongiello","Driscoll","Baar","Luff",
	    "Selenyi","Bierman","Baaz","Dayana","Emmerich","Flowers","Gaughan",
	    "Dayang","Benveniste","Hasham","Baba","Luft","Molenkamp","Babb",
	    "Avouris","Zaccaria","Pappas","Berztiss","Brookner","Lortz",
	    "Oehlmann","Choobineh","Eastman","Papsdorf","Luga","Klassen",
	    "Wynblatt","Babu","Baby","Greenaway","Glinert","Baca","Leivant",
	    "Rodite","Bach","Perelgut","Middleton","Back","Polupanov","Quadeer",
	    "Monkewich","Krybus","Colorni","Halevi","Schaad","Schaaf","Milicia",
	    "Bade","Milicic","Schiper","Teitelbaum","Toyoshima","Kading","Schaap",
	    "Molberg","Puppe","Schaar","Kriebel","Karnin","Nooteboom","Stille",
	    "Guerreiro","Hockney","Badr","Murrill","Puppo","Ishibashi","Bazzichi",
	    "Karcich","Sethi","Trelles","Sanella","Merkl","Veldwijk","Luit",
	    "Riefers","England","Merks","Langford","Spataro","Luiz","Haddadi",
	    "Heering","Baek","Bael","Setia","Gomatam","Jansch","Baer",
	    "Encarnacion","O'Boyle","Merle","Vigier","Macedo","Otillio","Baez",
	    "Asmuth","Merli","Beidas","Chaudhuri","Hiltgen","Rahimi","Merlo",
	    "Schach","Pavlopoulou","Vernadat","Laventhal","Pellegrinelli","Setiz",
	    "Anguita","Chaudhury","D'Silva","Pluym","Coullard","Kolvik","Taubman",
	    "Akazan","Huxford","Pusterhofer","Jahnichen","Pfau","Luke","Demizu",
	    "Nitsche","Passino","Jenevein","Hardjono","Lorys","Schade","Luks",
	    "Hutton","Millington","Pietrzykowski","Bage","Turnbull","Gniady",
	    "McAffer","Awdeh","Vasanthakumar","Benner","Bennet","Anily","Eugenio",
	    "Jansen","Schapire","Benzaken","Shinomoto","Rajaraman","Thisen",
	    "Schapiro","Kuhnemann","Bahi","Bahk","Bahl","Edelhoff","Ginneken",
	    "Lovengreen","Bahr","Francisci","Berstel","Cullers","Snedden",
	    "Azadmanesh","Angelov","Janetzko","Slaats","Simmel","Hemaspaandra",
	    "Androutsos","Oskamp","Simmen","Bernatsky","Chorvat","Kaelbling",
	    "Cangellaris","Jonsson","Baig","Tiemann","Falby","Orsini","Baik",
	    "Bail","Llado","Schaft","Bain","Percebois","Zhang","Lund","Morton",
	    "Lung","Kieras","Kumaresan","Kermarrec","Lunn","Hashii","Falck",
	    "Falco","Hopewell","Baja","Lunt","Douceur","Beeson","Mersereau",
	    "Crooks","Yoshizawa","Weisert","Lukaszewicz","Khamsi","Auyong",
	    "Terekhov","Impagliazzo","Candan","Schueller","Gerlach","Skogmar",
	    "Oberman","Meszaros","Marchesini","Segond","Luon","Georgatos",
	    "Genther","Yamaashi","Kruskal","Schahn","Kuszyk","Molenaar",
	    "Maccarone","Bennis","Schmezko","Copas","Loncour","Eiter","Hatcliff",
	    "Frezza","Merro","Sherertz","Bala","DeMori","Lupu","Bale","Weedman",
	    "Schain","Mohrherr","Ball","Lutzeler","Weinreich","Bals","Lance",
	    "Rinschede","Crescenzi","Esch","Berstis","Hacken","Snelgrove",
	    "Crescenzo","Cusack","Grivas","Verlind","Loeppner","Bishr","Dondina",
	    "Siegl","DuMouchel","Hamrick","Mahony","Tchoumatchenko","Landi",
	    "Khakhar","Lando","Hillston","Worthington","Mitkas","Schmidmaier",
	    "Antonellis","Cakic","Bang","Watanabe","Landy","Banh","Wojdyllo",
	    "Olaniran","Kingston","Yabe","Yuguchi","Mertz","Koshkin","Camacho",
	    "Friesem","Bank","Giani","Friesen","Bridges","Bann","Rohlicek",
	    "Maamar","Pradelles","Kupiec","Cakir","Pinger","Roullet","Rotger",
	    "Lusk","Nisonger","Suraweera","Zumbusch","Scheidler","Laulhere",
	    "Carlsson","Balaji","Lust","Lanet","Weaver","Schalk","Wolford",
	    "Schall","Razborov","Dickmanns","Aalborg","Paterson","Yach",
	    "Josifovski","Lagnier","Puustjarvi","Mecking","Trosch","Buskens",
	    "Eilenberg","Danziger","Luth","Stefani","Thollembeck","Stefano",
	    "Falin","Bateman","Yada","Tweedie","Bestgen","Lutz","Ingolfsdottir",
	    "Sobieski","O'Neill","Kleiter","Schamp","Westcott","Bichler","Lange" };
	
}
