import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'convertToSpacesPipe'
})
export class ConvertToSpacesPipePipe implements PipeTransform {

  transform(value:string, character:string, ) {
    return value.replace(character, '@');
}


}
