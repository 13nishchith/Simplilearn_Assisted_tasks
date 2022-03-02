import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-product-list',
  templateUrl: './product-list.component.html',
  styleUrls: ['./product-list.component.css']
})
export class ProductListComponent implements OnInit {
  pageTitle: string="product list page";
  imageWidth:number = 80;
  imageMargin:number = 10;
  showImage:boolean = false;

  toggleImage() : void{
    this.showImage=!this.showImage;
    console.log("value of showimage inside function :" , this.showImage);
  };

  constructor() { }

  ngOnInit(): void {
  }

}
