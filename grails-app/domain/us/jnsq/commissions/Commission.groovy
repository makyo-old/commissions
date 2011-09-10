package us.jnsq.commissions

class Commission {
    PricingStructure pricingStructure
    User commissioner
    User artist

    static constraints = {
    }
    static hasMany = {
        characters: Character
    }
}
