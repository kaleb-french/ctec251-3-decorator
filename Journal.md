# Journal

Phase 1-
The PlainText class and the TextDecorator should have the same interface component so they both can be used interchagably as TextComponent.
The inheritance tree has a Is-A relationship meaning it can be classified under IE a dog IS A animal.
The composition style uses a has a relationship meaning knife has a blade, handle, or enhancement meaning it is a component of knife

Phase 2-
When implementing rendering logic its a trickle down effect of sorts. The PlainText has is wraped by for instance the UpperCase then wrapped by a BoldDecorator. 
So in this chain the Bold would be the first one called which then calles the uppercase then the plain text which would return in reverse order causing plain texted then Uppercased then boldened.
The original component is the only one holding hard data to create a single source of truth and creating changes through temporary shifts rather than permanent mutation.
I imagine the output of UpperCase then bold vs bold then Uppercase would look the same but if you were to have outputs in the middle like in each decorator you would see the changes at each step.
Regular, upper, then bold, or Regular, bold, then upper.

Phase 3-
It satisfies the Open-Closed Principle by keeping a single source of truth that is CLOSED to modification but remains open to extension.
The concrete decorators are extensions of the abstract TextDecorator class, so the only needed to create a Underline class is just create that concrete class.
  