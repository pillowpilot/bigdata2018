namespace java org.politecnica.federico.hdfswritertest1

/*************
 * ENTIDADES *
 *************/

//////////////
// Atentado //
//////////////
union Attack
{
  1: i64 attackId;
  2: i64 true_as_of_secs; // timestamp
}

// Propiedades
union AttackPropertyValue
{
  1: string summary;
  2: double latitude;
  3: double longitude;
  4: i64 nkills;
}

struct AttackProperty
{
  1: AttackPropertyValue property;
}

///////////////////////////////////
// Arma utilizada en el Atentado //
///////////////////////////////////
union Weapon
{
  1: i64 weaponId;
}

// Propiedades
union WeaponPropertyValue
{
  1: string description;
}

struct WeaponProperty
{
  1: WeaponPropertyValue property;
}

////////////////////////////
// Ubicacion del Atentado //
////////////////////////////
union Location
{
  1: i64 locationId;
}

// Propiedades
union LocationPropertyValue
{
  1: string country;
  2: string region;
  3: string city;
}

struct LocationProperty
{
  1: LocationPropertyValue property;
}


/**************
 * RELACIONES *
 **************/

// A Terrorist Attack HAPPENS in a Location
struct HappendsEdge
{
  1: i64 attackId;
  2: i64 locationId;
}

// A Terrorist Attack USES a Weapon
struct UsesEdge
{
  1: i64 attackId;
  2: i64 weaponId;
}

/*
 * NORMALIZADORES (interfaz comun para aristas (props y rels) )
 */

union DataUnit
{
  1: AttackProperty attackProperty;
  2: WeaponProperty weaponProperty;
  3: LocationProperty locationProperty;
  4: HappendsEdge happedsEdge;
  5: UsesEdge usesEdge;
}

struct Pedigree
{
  1: i64 timestamp; // timestamp
}

struct Data
{
  1: Pedigree pedigree;
  2: DataUnit dataUnit;
}


/*************
 * SERVICIOS *
 *************/

service AttackService
{
  i64 addAttack(1: i64 attackId),
  void setAttackSummary(1: i64 attackId, 2: string summary),
  void setAttackLatitude(1: i64 attackId, 2: double latitude),
  void setAttackLongitude(1: i64 attackId, 2: double longitude),
  void setAttackNumberOfKills(1: i64 attackId, 2: i64 numberOfKills),
  void setAttackLocation(1: i64 attackId, 2: i64 locationId),
  void setAttackWeapon(1: i64 attackId, 2: i64 weaponId)
}

service LocationService
{
  i64 addLocation(1: i64 locationId),
  void setLocationCountry(1: i64 locationId, 2: string country),
  void setLocationRegion(1: i64 locationId, 2: string region),
  void setLocationCity(1: i64 locationId, 2: string city)
}

service WeaponService
{
  i64 addWeapon(1: i64 weaponId),
  void setWeaponDescription(1: i64 weaponId, 2: string description)
}
