import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { ConvertToSpacesPipePipe } from './app/convert-to-spaces-pipe.pipe';
import { ProductListComponent } from './app/product-list/product-list.component';

@NgModule({
  declarations: [
    AppComponent,
    ConvertToSpacesPipePipe,
    ProductListComponent
  ],
  imports: [
    BrowserModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
