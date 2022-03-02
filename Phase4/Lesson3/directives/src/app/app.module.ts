import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
// import { ChangeColorDirective } from './ChangeColor.directive';
import { AppComponent } from './app.component';
import { ColorDirective } from './color.directive';

@NgModule({
  declarations: [
    // AppComponent
    // ChangeColorDirective,
    // ProductComponent,
    // MyUpperPipe,
    // DiscountPipe,
    // ProductSearch,
    // ProductDetailComponent

    
  
    ColorDirective
  ],
  imports: [
    BrowserModule,
    // sharedModule

  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
