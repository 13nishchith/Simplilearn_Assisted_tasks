import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-product-list',
  templateUrl: './product-list.component.html',
  styleUrls: ['./product-list.component.css']
})
export class ProductListComponent implements OnInit {
 

  toggleImage() : void{
  
    console.log("image clicked:"); 
  
  };

  constructor() { }

  ngOnInit(): void {
  }

}
