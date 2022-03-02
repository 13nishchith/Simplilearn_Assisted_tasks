import { Injectable } from '@angular/core';
import { Quizformat } from '../quizdisplay/quizformat';

@Injectable({
  providedIn: 'root'
})
export class QuizcontentsService {

	path:string =""; 
	user_option = ["","","","","","","","","",""];
	cans = [];
	currentu ="";
   
	constructor() {}

	mymethod(data:string){
		this.path = data;
	}

	User_option_update(ind:number,data:string){
		this.user_option[ind] = data; 
	}

	UserPass:any[]=[
		{
			"Ufname":"Prashant",
			"Ulname":"Singh",
			"Umail":"pras@gmail.com",
			"Upass":"dont123"

			
		},
		{
			"Ufname":"Rishu",
			"Ulname":"Singh",
			"Umail":"rishu@gmail.com",
			"Upass":"need123"
			
		}

	]

	gk_content:Quizformat[] = [
		{
			qid:"1",
			qtext:"Which one is the smallest ocean in the world",
			op1:"Indian",
			op2:"Pacific",
			op3:"Arctic",
			op4:"Atlantic",
			ans:"Arctic"	
		},
		{
			qid:"2",
			qtext:"Which country gifted the Statue of Liberty to USA in 1886",
			op1:"Canada",
			op2:"Brazil",
			op3:"England",
			op4:"France",
			ans:"France"
		},
		{
			qid:"3",
			qtext:"Dead sea is located between which two countries",
			op1:"Jordan and Sudan",
			op2:"Jordan and Israel",
			op3:"Turkey and UAE",
			op4:"UAE and Egypt",
			ans:"Jordan and Sudan"
		},

		{
			qid:"4",
			qtext:"In ehich ocean Bermuda triangle region is located ",
			op1:"Indian",
			op2:"Pacific",
			op3:"Atlantic",
			op4:"All of the above",
			ans:"Atlantic"
		},
		{
			qid:"5",
			qtext:"Which continent has the highest number of countries ?",
			op1:"Asia",
			op2:"Europe",
			op3:"North America",
			op4:"Africa",
			ans:"Africa"
		},
		{
			qid:"6",
			qtext:"Total number of oceans in the world",
			op1:"5",
			op2:"3",
			op3:"7",
			op4:"12",
			ans:"5"
		},
		{
			qid:"7",
			qtext:"Which one is the biggest island in the world",
			op1:"Borneo",
			op2:"Greenland",
			op3:"Finland",
			op4:"Sumatra",
			ans:"Greenland"
		},
		{
			qid:"8",
			qtext:"Which one is the largest tropical rain forest in the world",
			op1:"Bosawas",
			op2:"Amazon",
			op3:"Southeast Asian Rain Forest",
			op4:"Daintree Rain Forest",
			ans:"Amazon"
		},

		{
			qid:"9",
			qtext:"The world's longest straight road without any corners is located in ?",
			op1:"USA",
			op2:"Saudi Arabia",
			op3:"Australia",
			op4:"china",
			ans:"Saudi Arabia"
		},
		{
			qid:"10",
			qtext:"Which one is the longest contental mountain range in the world",
			op1:"Andes",
			op2:"Himalaya",
			op3:"Rocky Mountains",
			op4:"Ural Mountains",
			ans:"Andes"
		}
	]

	tech_content:Quizformat[] = [
		{
			qid:"1",
			qtext:"Which one is the first search engine in internet?",
			op1:"Google",
			op2:"Altavista",
			op3:"Safari",
			op4:"Archie",
			ans:"Archie"
		},
		{
			qid:"2",
			qtext:"Number of bit used by the IPv6 address?",
			op1:"32 bit",
			op2:"128 bit",
			op3:"64 bit",
			op4:"256 bit",
			ans:"128 bit"
		},
		{
			qid:"3",
			qtext:"First computer virus is known as",
			op1:"Rabbit",
			op2:"Creeper Virus",
			op3:"Elk Cloner",
			op4:"SCA Virus",
			ans:"Creeper Virus"
		},
		{
			qid:"4",
			qtext:"Which one of the programming language is exclusively used for Artifical Intelligence ",
			op1:"C",
			op2:"Prolog",
			op3:"J2EE",
			op4:"Java",
			ans:"Prolog"
		},
		{
			qid:"5",
			qtext:"Firewall in computer is used for?",
			op1:"Security",
			op2:"Data Transmission",
			op3:"Authentication",
			op4:"Monitoring",
			ans:"Security"
		},
		{
			qid:"6",
			qtext:"Which of the following is not an operating system?",
			op1:"DOS",
			op2:"Mac",
			op3:"Linux",
			op4:"C",
			ans:"C"
		},
		{
			qid:"7",
			qtext:"Which company has completed the acquisition of smart wearable company Fitbit?",
			op1:"Hike",
			op2:"Flipkart",
			op3:"Facebook",
			op4:"Google",
			ans:"Google"
		},
		{
			qid:"8",
			qtext:"Which of the following is not a database management software?",
			op1:"MySQL",
			op2:"Oracle",
			op3:"Sybase",
			op4:"COBOL",
			ans:"COBOL"
		},
		{
			qid:"9",
			qtext:"Number of layers in the OSI model?",
			op1:"9",
			op2:"3",
			op3:"11",
			op4:"7",
			ans:"7"
		},
		{
			qid:"10",
			qtext:"Mac Operating system is developed by which company?",
			op1:"IBM",
			op2:"Microsoft",
			op3:"Apple",
			op4:"Samsung",
			ans:"Apple"
		}
	]

	appti_content:Quizformat[] = [
		{
			qid:"1",
			qtext:"Which one of the following is not a prime number?",
			op1:"31",
			op2:"91",
			op3:"71",
			op4:"61",
			ans:"91"
		},
		{
			qid:"2",
			qtext:"(112x54)=?",
			op1:"67000",
			op2:"76500",
			op3:"77200",
			op4:"70000",
			ans:"70000"
		},
		{
			qid:"3",
			qtext:" What least number must be added to 1056, so that the sum is completely divisible by 23 ?",
			op1:"3",
			op2:"21",
			op3:"18",
			op4:"2",
			ans:"2"
		},
		{
			qid:"4",
			qtext:"1397*1397",
			op1:"1981709",
			op2:"1951609",
			op3:"18362619",
			op4:"2031719",
			ans:"1951609"
		},
		{
			qid:"5",
			qtext:"The sum of five prime numbers",
			op1:"11",
			op2:"18",
			op3:"28",
			op4:"26",
			ans:"28",
		},
		{
			qid:"6",
			qtext:"The smallest 3 digit prime number is:",
			op1:"103",
			op2:"107",
			op3:"113",
			op4:"None of these",
			ans:"None of these"
		},
		{
			qid:"7",
			qtext:"The smallest prime number is",
			op1:"1",
			op2:"2",
			op3:"3",
			op4:"4",
			ans:"2"
		},
		{
			qid:"8",
			qtext:"How many 3-digit numbers are completely divisible 6 ?",
			op1:"149",
			op2:"151",
			op3:"166",
			op4:"150",
			ans:"150"
		},
		{
			qid:"9",
			qtext:"If the number 5 * 2 is divisible by 6, then * = ?",
			op1:"6",
			op2:"3",
			op3:"2",
			op4:"7",
			ans:"2"
		},
		{
			qid:"10",
			qtext:"What least number must be added to 1056, so that the sum is completely divisible by 23 ?",
			op1:"2",
			op2:"3",
			op3:"18",
			op4:"21",
			ans:"2",
		}
	]
}
